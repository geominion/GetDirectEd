package appEd.getDirectEd.main;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;

public class FacilitiesActivity extends TabActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	   
        setContentView(R.layout.facilities_view);
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab
        
        intent = new Intent().setClass(this, AllFacilityActivity.class);
        spec = tabHost.newTabSpec("all").setIndicator("All Facilities",
                          res.getDrawable(R.drawable.ic_tab_artists))
                      .setContent(intent);
        tabHost.addTab(spec);

        
        intent = new Intent().setClass(this, MinFacilityActivity.class);
        spec = tabHost.newTabSpec("min").setIndicator("Facilities within 5km",
                          res.getDrawable(R.drawable.ic_tab_artists))
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(2);
        
        Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(FacilitiesActivity.this, GetDirectEdActivity.class);
            	startActivity(intent);       
			}
		});
	}

}
