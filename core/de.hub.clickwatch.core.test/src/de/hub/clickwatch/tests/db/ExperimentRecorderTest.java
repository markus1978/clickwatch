package de.hub.clickwatch.tests.db;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.cwdatabase.DataBase;
import de.hub.clickwatch.cwdatabase.ExperimentRecorder;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.tests.AbstractTest;

public class ExperimentRecorderTest extends AbstractTest {

	private static final String experimentFile = "testdb.cwdatabase";
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "../../03_git/clickwatch/ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Ignore("work in progress")
	@Test
	public void testWithRecord() throws Exception {		
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
		Resource resource = rs.getResource(URI.createFileURI(experimentFile), true);
		DataBase database = (DataBase)resource.getContents().get(0);
		ExperimentRecorder recorder = injector.getInstance(ExperimentRecorder.class);
		
		recorder.record(database.getExperiments().get(0));		
		resource.save(XmlModelRepository.defaultLoadSaveOptions());
		
		System.out.println(recorder.getStats().toString());
	}
}