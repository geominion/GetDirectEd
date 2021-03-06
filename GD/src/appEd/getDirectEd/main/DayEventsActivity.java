package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import appEd.getDirectEd.adapter.ActivityListString;
import appEd.getDirectEd.database.DatabaseHandler;

public class DayEventsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.day_event_view);
        ListView eventView = (ListView) findViewById(R.id.listView1);
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        
        //final ArrayList<appEd.getDirectEd.model.Event> eventList = queryBox.getDayEvents;
       //eventView.setAdapter(new EventListString(this, eventList));
                
        eventView.setOnItemClickListener(new OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View view,
               int position, long id) {
        	//queryBox.setActivity(eventList.get(position));
       		Intent intent = new Intent(DayEventsActivity.this, SubActivitiesActivity.class);
       		DayEventsActivity.this.startActivity(intent);
           }
       });
    }

}
