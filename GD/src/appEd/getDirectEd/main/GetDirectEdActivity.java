package appEd.getDirectEd.main;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class GetDirectEdActivity extends Activity {
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	
		setContentView(R.layout.main_view);
	
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(GetDirectEdActivity.this, ActivitiesActivity.class);
            	startActivity(intent);       
			}
		});
		
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(GetDirectEdActivity.this, FacilitiesActivity.class);
            	startActivity(intent);       
			}
		});

		Button button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(GetDirectEdActivity.this, EventsActivity.class);
            	startActivity(intent);       
			}
		});

		Button button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(GetDirectEdActivity.this, NowActivity.class);
            	startActivity(intent);       
			}
		});

		Button button5 = (Button)findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(GetDirectEdActivity.this, FavouritesActivity.class);
            	startActivity(intent);       
			}
		});


	}
}