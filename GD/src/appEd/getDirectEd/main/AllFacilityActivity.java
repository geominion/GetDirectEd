package appEd.getDirectEd.main;

	import java.util.ArrayList;

	import android.app.Activity;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.AdapterView;
	import android.widget.ArrayAdapter;
	import android.widget.ListView;
	import android.widget.AdapterView.OnItemClickListener;

	public class AllFacilityActivity extends Activity {
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        setContentView(R.layout.facilities_view);
	        
	        
	        ListView facilityView = (ListView) findViewById(R.id.listView1);
	        String[] facilities = {};
	        ArrayList<String> facilityList=new ArrayList<String>();
	       
	        if(facilityList != null){
	        	facilityView.setVisibility(View.VISIBLE);
	        	facilities=(String[])facilityList.toArray(new String[0]);
	            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	                    android.R.layout.simple_list_item_1, android.R.id.text1, facilities);
	            // Assign adapter to ListView
	            facilityView.setAdapter(adapter);
	        }
	        facilityView.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	               
	            }
	         });
		}

	}

