package appEd.getDirectEd.main;

import android.app.Application;
import android.content.Context;
import appEd.getDirectEd.database.DatabaseHandler;

public class GetDirectEdApplication extends Application {
	
	transient private static DatabaseHandler database = null;
	
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		setupDatabase(this);
	}
	
	private void setupDatabase(Context context) {
		database = new DatabaseHandler(context);
		database.databaseSetUp(this);
	}

	static DatabaseHandler getDatabase() {
		return database;
	}
}
