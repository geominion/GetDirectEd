package appEd.getDirectEd.main;

import android.app.Activity;
import android.os.Bundle;
import appEd.getDirectEd.database.DatabaseHandler;
import appEd.getDirectEd.model.Facility;

public class FacilityDetailsActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.facility_results);
        
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        Facility aFacility = queryBox.getFacility();
        
	}
}
