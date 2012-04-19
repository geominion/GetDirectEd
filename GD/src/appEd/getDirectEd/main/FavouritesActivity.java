package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import appEd.getDirectEd.database.DatabaseHandler;

public class FavouritesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.favourites_view);
        ListView favouritesView = (ListView) findViewById(R.id.listView1);
        final DatabaseHandler queryBox = GetDirectEdApplication.getDatabase();
        
         //  final ArrayList<appEd.getDirectEd.model.Facility> favList = queryBox.getFavoutiteFacilities();
        //   favouritesView.setAdapter(new FacilityListString(this, favList));
           
        favouritesView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            	 Toast.makeText(getBaseContext(), "No favourites added yet!", Toast.LENGTH_SHORT).show();
           

            }
         });
	}

}
