package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class FavouritesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.favourites_view);
        ListView favouritesView = (ListView) findViewById(R.id.listView1);
        String[] favourites = {};
        ArrayList<String> favouritesList=new ArrayList<String>();
        
        if(favouritesList != null){
        	favouritesView.setVisibility(View.VISIBLE);
        	favourites=(String[])favouritesList.toArray(new String[0]);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, favourites);
            // Assign adapter to ListView
            favouritesView.setAdapter(adapter);
        }
        favouritesView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
               
            }
         });
	}

}
