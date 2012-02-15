/**
 *
 */
package de.hub.clickwatch.tracesexample.hwbusy

import scala.collection.JavaConversions._
import de.hub.clickwatch.analysis.results.Results
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.digitalforger.smtl.m2m.TransformationM2M
import de.digitalforger.smtl.m2m.TransformationHelperSyntax._
import de.digitalforger.smtl.m2m.Rule
import de.hub.clickwatch.datamodel.Node
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.ui.ResultsChartVisualization
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import org.apache.log4j.BasicConfigurator
import de.hub.clickwatch.datamodel.Network
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats
import de.hub.clickwatch.analysis.results.NumericalResult
import javax.swing.JFrame
import java.util.LinkedList
import de.hub.clickwatch.analysis.results.Chart
import de.hub.clickwatch.analysis.results.util.ChartUtil
import de.hub.clickwatch.analysis.results.Series
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Phy
import de.hub.clickwatch.analysis.results.DoubleDataResultValue
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats
import java.util.ArrayList
import de.hub.clickwatch.analysis.results.DataResultSet
import de.hub.clickwatch.analysis.results.xyDataResultSet
import de.hub.clickwatch.analysis.results.util.ResultsSwitch

/**
 * @author Lars George
 *
 */
object HWBusyExampleSMTL {
  private var SHOW_GRAPH = true
  private val resultList = new LinkedList[NumericalResult]
  private var onlyNodes = new ArrayList[Node]

  def main(args : Array[String]) {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure();

    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    val resultsMM = "http://de.hub.clickwatch.analysis.results";
    val cwMM = "http://de.hub.clickwatch.datamodel";
    val inputFile = "file:dump/dump.xmi"

    val hwbusyTransformation = new TransformationM2M("Topology") from cwMM in inputFile to resultsMM

    //
    // RULE: networkRule
    val networkRule = new Rule[Network, NumericalResult]("Network") using ((helper, network, result) => {
      result.getCharts().add(ChartUtil.createXYChart("Plot over time", "nodes", "time", "HW_busy"));
      resultList.add(result)

      // just to get some "selected" nodes for the transformation
      for (i <- 0 to 2) {
        //helper.transform(node, classOf[Series])
        var node = network.getNodes().get(i)
        onlyNodes.add(node)
      }
    })

    //
    // RULE nodeRule
    val nodeRule = new Rule[Node, xyDataResultSet]("Node") when ((node) => { onlyNodes.contains(node) }) using ((helper, node, resultSet) => {
      resultSet.setName(node.getINetAddress())

      // for all time values
      for (statsHandler <- node.getHandler("device_wifi/wifidevice/cst/stats").getValues()) {
        val hwBusyResult = helper.transform(statsHandler, classOf[DoubleDataResultValue])
        val timeValue = create[DoubleDataResultValue]
        timeValue.setValue(statsHandler.asInstanceOf[Stats].getTimestamp())

        resultSet.getXValues.add(timeValue)
        resultSet.getYValues.add(hwBusyResult)
      }    
    })

    //
    // RULE statsRule
    val statsRule = new Rule[Stats, DoubleDataResultValue]("Stats") isLazy () using ((helper, statsHandler, resultValue) => {
      val result = resultList.get(0)
      var time : java.lang.Long = statsHandler.getTimestamp()
      var hwBusy : Integer = statsHandler.getChannelstats().getPhy().getHwbusy()

      resultValue.setValue(hwBusy.toDouble)

      // wont be needed if visualisation can read new output data model
      // to be able to display the result
      result.getData().add(
        statsHandler.getChannelstats().getNode(),
        time,
        hwBusy);
    })

    hwbusyTransformation.setShowDirectTrace(false)
    hwbusyTransformation.addRule(networkRule, nodeRule, statsRule)
    hwbusyTransformation transform "dump/dump.xmi" exportToFile "outputHWBusy.xmi"

    if (SHOW_GRAPH) {
      showGraph()
    }    
  }

  private def showGraph() = {

    var jframe = new JFrame("Visualization")
    jframe.setSize(800, 600);
    var visual = new ResultsChartVisualization();
    var c = visual.createVisualization(resultList)
    if (c != null) {
      jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
      jframe.getContentPane().add(c)
      jframe.setVisible(true)

    }
  }

}