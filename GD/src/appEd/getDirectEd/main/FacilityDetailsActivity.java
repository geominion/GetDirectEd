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
        
        //for testing purposes
        /*Facility afacility = new Facility();
        afacility.setName("Josh's Recland");
        afacility.setAddress("123 Upyourass");
        afacility.setPhone("780-555-1234");
        afacility.setDescription("This facility is so awesome it will literally make you involuntarily wet your pants." +
        		" It has everything you could possible want from a facility and more.");*/
        // end testing
        
        
        TextView infoView = (TextView) findViewById(R.id.textView1);
        infoView.setText(afacility.getName() + "\n" + afacility.getAddress() + "\n" + afacility.getPhone() + 
        		"\n" + afacility.getDescription());
        
	}
}
