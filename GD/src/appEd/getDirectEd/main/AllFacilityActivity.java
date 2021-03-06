package appEd.getDirectEd.main;

	import java.util.ArrayList;

	import android.app.Activity;
import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.AdapterView;
	import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import appEd.getDirectEd.adapter.FacilityListString;
import appEd.getDirectEd.database.DatabaseHandler;

	public class AllFacilityActivity extends Activity {
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        setContentView(R.layout.all_fac_view);
	        
	        
	        ListView facilityView = (ListView) findViewById(R.id.listView1);
	        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
	        
	        final ArrayList<appEd.getDirectEd.model.Facility> facList = queryBox.getAllFacilities();
	        facilityView.setAdapter(new FacilityListString(this, facList));
	        
	        facilityView.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	            	queryBox.setFacility(facList.get(position).getId());
            		Intent intent = new Intent(AllFacilityActivity.this, FacilityDetailsActivity.class);
            		AllFacilityActivity.this.startActivity(intent);
	            }
	         });
		}

	}

