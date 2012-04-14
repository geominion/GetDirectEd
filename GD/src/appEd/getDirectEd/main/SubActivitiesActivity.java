package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import appEd.getDirectEd.adapter.ActivityListString;
import appEd.getDirectEd.database.DatabaseHandler;

public class SubActivitiesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_subview);
        ListView activityView = (ListView) findViewById(R.id.listView1);
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        
        final ArrayList<appEd.getDirectEd.model.Activity> subList = queryBox.getAllActivities();
        activityView.setAdapter(new ActivityListString(this, subList));
        
        activityView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
               
            	queryBox.getFacilities(subList.get(position));
            	Intent intent = new Intent(SubActivitiesActivity.this, FacilitiesActivity.class);
            	SubActivitiesActivity.this.startActivity(intent);
            	
            }
         });
	}

}
