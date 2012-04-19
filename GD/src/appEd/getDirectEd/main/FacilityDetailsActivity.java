package appEd.getDirectEd.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import appEd.getDirectEd.database.DatabaseHandler;
import appEd.getDirectEd.model.Facility;

public class FacilityDetailsActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.facility_results);
        
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        
        Facility afacility = queryBox.getFacility();
        
        
        TextView infoView = (TextView) findViewById(R.id.textView1);
        infoView.setText(afacility.getName() + "\n" + afacility.getAddress() + "\n" + afacility.getPhone() + 
        		"\n" + afacility.getDescription() + "\n\n" +
        				"\nACTIVITY 1:  08:00-10:00" +
        				"\nACTIVITY 2   11:00-12:00" +
        				"\nACTIVITY 3   09:30-12:00" +
        				"\nACTIVITY 4   11:00-14:00" +
        				"\nACTIVITY 5   13:00-14:00" +
        				"\nACTIVITY 6   15:00-16:00" +
        				"\nACTIVITY 7   11:30-13:30" +
        				"\nACTIVITY 8   16:00-16:30" +
        				"\nACTIVITY 9   10:00-12:30" +
        				"\nACTIVITY 10  15:00-16:30" +
        				"\nACTIVITY 11  14:00-15:30" +
        				"\nACTIVITY 12  18:00-21:00" +
        				"\nACTIVITY 13  16:00-18:00" +
        				"\nACTIVITY 14  17:00-19:00" +
        				"\nACTIVITY 15  18:30-20:30" );
        
	}
}
