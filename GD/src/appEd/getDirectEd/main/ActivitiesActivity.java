package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivitiesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_view);
        ListView activityView = (ListView) findViewById(R.id.listView1);
        String[] activities = {};
        ArrayList<String> activityList=new ArrayList<String>();
        myDB = activities.this.openOrCreateDatabase("db", MODE_PRIVATE, null);
        Cursor activitycursor = ourDB.rawQuery("SELECT * FROM activities");

        String[] activityarray = new String[activitycursor.getCount()];//is this needed?
        activitycursor.moveToFirst();   

        int counter = 0;
        while(activitycursor.moveToNext()){
            String eventName = activitycursor.getString(activitycursor.getColumnIndex("event_name"));
            activityList.add(eventName);
            counter++;
        }
        if(activityList != null){
            activityView.setVisibility(View.VISIBLE);
            activities=(String[])activityList.toArray(new String[0]);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, activities);
            // Assign adapter to ListView
            activityView.setAdapter(adapter);
        }
	}
}

