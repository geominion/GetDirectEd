package appEd.getDirectEd.main;

import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FavouritesActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.favourites_view);
        ListView favouritesView = (ListView) findViewById(R.id.listView1);
        String[] favourites = {};
        ArrayList<String> favouritesList=new ArrayList<String>();
        myDB = favourites.this.openOrCreateDatabase("db", MODE_PRIVATE, null);
        Cursor favouritescursor = ourDB.rawQuery("SELECT * FROM favourites");
        String[] favouritesarray = new String[favouritescursor.getCount()];
        favouritescursor.moveToFirst();   
        int counter = 0;
        while(favouritescursor.moveToNext()){
            String favouritesName = favouritescursor.getString(favouritescursor.getColumnIndex("favourites_name"));
            favouritesList.add(favouritesName);
            counter++;
        }
        if(favouritesList != null){
        	favouritesView.setVisibility(View.VISIBLE);
        	favourites=(String[])favouritesList.toArray(new String[0]);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, favourites);
            // Assign adapter to ListView
            favouritesView.setAdapter(adapter);
        }
	}

}
