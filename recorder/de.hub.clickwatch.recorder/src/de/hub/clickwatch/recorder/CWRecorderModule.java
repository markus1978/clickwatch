package de.hub.clickwatch.recorder;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;

public class CWRecorderModule extends AbstractModule {

	public static final String L_DEFAULT_UPDATE_INTERVAL_PROPERTY		= "CWRecorderModule.defaultUpdateInterval";
	public static final String I_HANDLER_PER_RECORD_PROPERTY 			= "CWRecorderModule.handlerPerRecord";
	public static final String B_RECORD_CHANGES_ONLY_PROPERTY	 		= "CWRecorderModule.recordChangesOnly";
	public static final String DB_VALUE_ADAPTER_PROPERTY 				= "CWRecorderModule.dbValueAdapter";
	public static final String B_SAVE_RECORD_FILE						= "CWRecorderModule.saveRecordFile";
	
	@Override
	protected void configure() {
		configureDataBaseRecordAdapter();
		configureDataBaseRetrieveAdapter();
		configureDefaultUpdateInterval();
		configureHandlerPerRecord();
		configureRecordChangesOnly();
		configureDBValueAdapter();		
		configureAdditionalBindings();	
		configureSaveRecordFile();
	}
	
	
	protected void configureSaveRecordFile() {
		bind(boolean.class).annotatedWith(Names.named(B_SAVE_RECORD_FILE)).toInstance(Boolean.TRUE);
	}


	protected void configureDefaultUpdateInterval() {
		bind(long.class).annotatedWith(Names.named(L_DEFAULT_UPDATE_INTERVAL_PROPERTY)).toInstance(new Long(2000));
	}

	protected void configureAdditionalBindings() {
		// empty
	}

	protected void configureRecordChangesOnly() {
		bind(boolean.class).annotatedWith(Names.named(B_RECORD_CHANGES_ONLY_PROPERTY)).toInstance(true);
	}

	protected void configureDataBaseRecordAdapter() {
		bind(IDataBaseRecordAdapter.class).to(HBaseDataBaseAdapter.class);
	}

	protected void configureDataBaseRetrieveAdapter() {
		bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
	}

	
	protected void configureDBValueAdapter() {
		bind(IValueAdapter.class).annotatedWith(Names.named(DB_VALUE_ADAPTER_PROPERTY)).to(StringValueAdapter.class);
	}

	protected void configureHandlerPerRecord() {
		bind(int.class).annotatedWith(Names.named(I_HANDLER_PER_RECORD_PROPERTY)).toInstance(2000);
	}
		
}
