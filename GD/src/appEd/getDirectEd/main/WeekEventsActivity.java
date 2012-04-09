package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class WeekEventsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.events_view);
        ListView eventView = (ListView) findViewById(R.id.listView1);
        String[] events = {};
        ArrayList<String> eventList=new ArrayList<String>();
      

       
       if(eventList != null){
           eventView.setVisibility(View.VISIBLE);
           events=(String[])eventList.toArray(new String[0]);
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                   android.R.layout.simple_list_item_1, android.R.id.text1, events);
           // Assign adapter to ListView
           eventView.setAdapter(adapter);
       }
       eventView.setOnItemClickListener(new OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View view,
               int position, long id) {
              
           }
       });
    }

}
