package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventsActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.events_view);
        ListView eventView = (ListView) findViewById(R.id.listView1);
        String[] events = {};
        ArrayList<String> eventList=new ArrayList<String>();
        myDB = events.this.openOrCreateDatabase("db", MODE_PRIVATE, null);
        Cursor eventscursor = ourDB.rawQuery("SELECT * FROM events");

       String[] eventsarray = new String[eventscursor.getCount()];
       eventscursor.moveToFirst();   

       int counter = 0;
       while(eventscursor.moveToNext()){
           String eventName = eventscursor.getString(eventscursor.getColumnIndex("event_name"));
           eventList.add(eventName);
           counter++;
       }
       if(eventList != null){
            eventView.setVisibility(View.VISIBLE);
            events=(String[])eventList.toArray(new String[0]);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, events);
            // Assign adapter to ListView
            eventView.setAdapter(adapter);
       }
	}
}
