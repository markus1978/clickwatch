/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.hub.clickwatch.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.DataBase;
import de.hub.clickwatch.cwdatabase.DataBaseStatistics;
import de.hub.clickwatch.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.cwdatabase.NodeRecord;
import de.hub.clickwatch.cwdatabase.NodeRecordDescr;
import de.hub.clickwatch.model.ClickWatchModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CWDataBasePackageImpl extends EPackageImpl implements CWDataBasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentDescrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentNodeRecordTimeTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToExperimentNodeRecordTimeTableMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLongObjectToNodeRecordDescrMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeRecordDescrEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CWDataBasePackageImpl() {
		super(eNS_URI, CWDataBaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CWDataBasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CWDataBasePackage init() {
		if (isInited) return (CWDataBasePackage)EPackage.Registry.INSTANCE.getEPackage(CWDataBasePackage.eNS_URI);

		// Obtain or create and register package
		CWDataBasePackageImpl theCWDataBasePackage = (CWDataBasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CWDataBasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CWDataBasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCWDataBasePackage.createPackageContents();

		// Initialize created meta-data
		theCWDataBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCWDataBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CWDataBasePackage.eNS_URI, theCWDataBasePackage);
		return theCWDataBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentDescr() {
		return experimentDescrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentDescr_Network() {
		return (EReference)experimentDescrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentDescr_Name() {
		return (EAttribute)experimentDescrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentDescr_Description() {
		return (EAttribute)experimentDescrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentDescr_Start() {
		return (EAttribute)experimentDescrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentDescr_Record() {
		return (EReference)experimentDescrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentDescr_NetworkTimeCopy() {
		return (EReference)experimentDescrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentDescr_DataBase() {
		return (EReference)experimentDescrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentDescr_Duration() {
		return (EAttribute)experimentDescrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentDescr_End() {
		return (EAttribute)experimentDescrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeRecord() {
		return nodeRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeRecord_Records() {
		return (EReference)nodeRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeRecord_Key() {
		return (EReference)nodeRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeRecord_Start() {
		return (EAttribute)nodeRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeRecord_End() {
		return (EAttribute)nodeRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeRecord_Node() {
		return (EAttribute)nodeRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Experiments() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBase_StorageBaseFileString() {
		return (EAttribute)dataBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Statistics() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentRecord() {
		return experimentRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentRecord_MetaData() {
		return (EReference)experimentRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentRecord_Name() {
		return (EAttribute)experimentRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentRecord_NodeMap() {
		return (EReference)experimentRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentNodeRecordTimeTable() {
		return experimentNodeRecordTimeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentNodeRecordTimeTable_NodeMap() {
		return (EReference)experimentNodeRecordTimeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToExperimentNodeRecordTimeTableMap() {
		return eStringToExperimentNodeRecordTimeTableMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToExperimentNodeRecordTimeTableMap_Key() {
		return (EAttribute)eStringToExperimentNodeRecordTimeTableMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStringToExperimentNodeRecordTimeTableMap_Value() {
		return (EReference)eStringToExperimentNodeRecordTimeTableMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELongObjectToNodeRecordDescrMap() {
		return eLongObjectToNodeRecordDescrMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELongObjectToNodeRecordDescrMap_Key() {
		return (EAttribute)eLongObjectToNodeRecordDescrMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELongObjectToNodeRecordDescrMap_Value() {
		return (EReference)eLongObjectToNodeRecordDescrMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBaseStatistics() {
		return dataBaseStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBaseStatistics_HandlerCount() {
		return (EAttribute)dataBaseStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBaseStatistics_SampleCount() {
		return (EAttribute)dataBaseStatisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBaseStatistics_ExperimentCount() {
		return (EAttribute)dataBaseStatisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeRecordDescr() {
		return nodeRecordDescrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeRecordDescr_Record() {
		return (EReference)nodeRecordDescrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBaseFactory getCWDataBaseFactory() {
		return (CWDataBaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		experimentDescrEClass = createEClass(EXPERIMENT_DESCR);
		createEReference(experimentDescrEClass, EXPERIMENT_DESCR__NETWORK);
		createEAttribute(experimentDescrEClass, EXPERIMENT_DESCR__NAME);
		createEAttribute(experimentDescrEClass, EXPERIMENT_DESCR__DESCRIPTION);
		createEAttribute(experimentDescrEClass, EXPERIMENT_DESCR__START);
		createEReference(experimentDescrEClass, EXPERIMENT_DESCR__RECORD);
		createEReference(experimentDescrEClass, EXPERIMENT_DESCR__NETWORK_TIME_COPY);
		createEReference(experimentDescrEClass, EXPERIMENT_DESCR__DATA_BASE);
		createEAttribute(experimentDescrEClass, EXPERIMENT_DESCR__DURATION);
		createEAttribute(experimentDescrEClass, EXPERIMENT_DESCR__END);

		nodeRecordEClass = createEClass(NODE_RECORD);
		createEReference(nodeRecordEClass, NODE_RECORD__RECORDS);
		createEReference(nodeRecordEClass, NODE_RECORD__KEY);
		createEAttribute(nodeRecordEClass, NODE_RECORD__START);
		createEAttribute(nodeRecordEClass, NODE_RECORD__END);
		createEAttribute(nodeRecordEClass, NODE_RECORD__NODE);

		dataBaseEClass = createEClass(DATA_BASE);
		createEReference(dataBaseEClass, DATA_BASE__EXPERIMENTS);
		createEAttribute(dataBaseEClass, DATA_BASE__STORAGE_BASE_FILE_STRING);
		createEReference(dataBaseEClass, DATA_BASE__STATISTICS);

		experimentRecordEClass = createEClass(EXPERIMENT_RECORD);
		createEReference(experimentRecordEClass, EXPERIMENT_RECORD__META_DATA);
		createEAttribute(experimentRecordEClass, EXPERIMENT_RECORD__NAME);
		createEReference(experimentRecordEClass, EXPERIMENT_RECORD__NODE_MAP);

		experimentNodeRecordTimeTableEClass = createEClass(EXPERIMENT_NODE_RECORD_TIME_TABLE);
		createEReference(experimentNodeRecordTimeTableEClass, EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP);

		eStringToExperimentNodeRecordTimeTableMapEClass = createEClass(ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP);
		createEAttribute(eStringToExperimentNodeRecordTimeTableMapEClass, ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP__KEY);
		createEReference(eStringToExperimentNodeRecordTimeTableMapEClass, ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP__VALUE);

		eLongObjectToNodeRecordDescrMapEClass = createEClass(ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP);
		createEAttribute(eLongObjectToNodeRecordDescrMapEClass, ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP__KEY);
		createEReference(eLongObjectToNodeRecordDescrMapEClass, ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP__VALUE);

		dataBaseStatisticsEClass = createEClass(DATA_BASE_STATISTICS);
		createEAttribute(dataBaseStatisticsEClass, DATA_BASE_STATISTICS__HANDLER_COUNT);
		createEAttribute(dataBaseStatisticsEClass, DATA_BASE_STATISTICS__SAMPLE_COUNT);
		createEAttribute(dataBaseStatisticsEClass, DATA_BASE_STATISTICS__EXPERIMENT_COUNT);

		nodeRecordDescrEClass = createEClass(NODE_RECORD_DESCR);
		createEReference(nodeRecordDescrEClass, NODE_RECORD_DESCR__RECORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ClickWatchModelPackage theClickWatchModelPackage = (ClickWatchModelPackage)EPackage.Registry.INSTANCE.getEPackage(ClickWatchModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(experimentDescrEClass, ExperimentDescr.class, "ExperimentDescr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentDescr_Network(), theClickWatchModelPackage.getNetwork(), null, "network", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentDescr_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentDescr_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentDescr_Start(), ecorePackage.getELong(), "start", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentDescr_Record(), this.getExperimentRecord(), null, "record", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentDescr_NetworkTimeCopy(), theClickWatchModelPackage.getNetwork(), null, "networkTimeCopy", null, 0, 1, ExperimentDescr.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentDescr_DataBase(), this.getDataBase(), this.getDataBase_Experiments(), "dataBase", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentDescr_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentDescr_End(), ecorePackage.getELong(), "end", null, 0, 1, ExperimentDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeRecordEClass, NodeRecord.class, "NodeRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeRecord_Records(), theClickWatchModelPackage.getHandler(), null, "records", null, 0, -1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeRecord_Key(), theClickWatchModelPackage.getHandler(), null, "key", null, 0, -1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeRecord_Start(), ecorePackage.getELong(), "start", null, 0, 1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeRecord_End(), ecorePackage.getELong(), "end", null, 0, 1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeRecord_Node(), ecorePackage.getEString(), "node", null, 0, 1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBase_Experiments(), this.getExperimentDescr(), this.getExperimentDescr_DataBase(), "experiments", null, 0, -1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataBase_StorageBaseFileString(), ecorePackage.getEString(), "storageBaseFileString", null, 0, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Statistics(), this.getDataBaseStatistics(), null, "statistics", null, 0, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentRecordEClass, ExperimentRecord.class, "ExperimentRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentRecord_MetaData(), theClickWatchModelPackage.getNode(), null, "metaData", null, 0, -1, ExperimentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentRecord_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentRecord_NodeMap(), this.getEStringToExperimentNodeRecordTimeTableMap(), null, "nodeMap", null, 0, -1, ExperimentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentNodeRecordTimeTableEClass, ExperimentNodeRecordTimeTable.class, "ExperimentNodeRecordTimeTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentNodeRecordTimeTable_NodeMap(), this.getELongObjectToNodeRecordDescrMap(), null, "nodeMap", null, 0, -1, ExperimentNodeRecordTimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToExperimentNodeRecordTimeTableMapEClass, Map.Entry.class, "EStringToExperimentNodeRecordTimeTableMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToExperimentNodeRecordTimeTableMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStringToExperimentNodeRecordTimeTableMap_Value(), this.getExperimentNodeRecordTimeTable(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eLongObjectToNodeRecordDescrMapEClass, Map.Entry.class, "ELongObjectToNodeRecordDescrMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELongObjectToNodeRecordDescrMap_Key(), ecorePackage.getELongObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELongObjectToNodeRecordDescrMap_Value(), this.getNodeRecordDescr(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBaseStatisticsEClass, DataBaseStatistics.class, "DataBaseStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataBaseStatistics_HandlerCount(), ecorePackage.getELong(), "handlerCount", null, 0, 1, DataBaseStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataBaseStatistics_SampleCount(), ecorePackage.getELong(), "sampleCount", null, 0, 1, DataBaseStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataBaseStatistics_ExperimentCount(), ecorePackage.getELong(), "experimentCount", null, 0, 1, DataBaseStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeRecordDescrEClass, NodeRecordDescr.class, "NodeRecordDescr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeRecordDescr_Record(), this.getNodeRecord(), null, "record", null, 0, 1, NodeRecordDescr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CWDataBasePackageImpl
