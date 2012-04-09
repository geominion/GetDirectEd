package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivitiesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_view);
        ListView activityView = (ListView) findViewById(R.id.listView1);
        String[] activities = {};
        ArrayList<String> activityList=new ArrayList<String>();
        
        
        if(activityList != null){
            activityView.setVisibility(View.VISIBLE);
            activities=(String[])activityList.toArray(new String[0]);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, activities);
            // Assign adapter to ListView
            activityView.setAdapter(adapter);
        }
        activityView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
               
            }
         });

	}
}

