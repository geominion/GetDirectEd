package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import appEd.getDirectEd.adapter.ActivityListString;
import appEd.getDirectEd.database.DatabaseHandler;

public class ActivitiesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_view);
        ListView activityView = (ListView) findViewById(R.id.listView1);
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        
        final ArrayList<appEd.getDirectEd.model.Activity> actList = queryBox.getAllActivities();
        
        activityView.setAdapter(new ActivityListString(this, actList));
        
        activityView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
               
            	if(actList.get(position).getSubType() == 1) {
            		queryBox.getSubActivities(actList.get(position));
            		Intent intent = new Intent(ActivitiesActivity.this, SubActivitiesActivity.class);
                	startActivity(intent);
            	}
            	else {
            		queryBox.getFacilities(actList.get(position));
                	Intent intent = new Intent(ActivitiesActivity.this, FacilitiesActivity.class);
                    startActivity(intent);
            	}
            }
         });

	}
}

