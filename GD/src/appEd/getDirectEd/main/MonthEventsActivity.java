package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import appEd.getDirectEd.database.DatabaseHandler;

public class MonthEventsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.month_event_view);
        ListView eventView = (ListView) findViewById(R.id.listView1);
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        
        //   final ArrayList<appEd.getDirectEd.model.Event> eventList = queryBox.getWeekEvents();
        //   eventView.setAdapter(new EventListString(this, eventList));
           
       eventView.setOnItemClickListener(new OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View view,
               int position, long id) {
              
           }
       });
    }
}
