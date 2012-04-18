package appEd.getDirectEd.adapter;

import java.util.ArrayList;
import android.content.Context;
import android.widget.ArrayAdapter;
import appEd.getDirectEd.model.SubActivity;
/**
 * @author James
 *
 * Activity Adapter set up for making more specialised adapters
 */
public class SubActivityAdapter extends ArrayAdapter<SubActivity>{
	/**
	 * Private values that can be used by extended classes
	 */
	protected final Context context;
	protected final ArrayList<SubActivity> list;
	
	/**
	 * ActivityAdapter constructor
	 * @param context - context in which the adapter is working
	 * @param layout - the layout being used by this adapter
	 * @param list - the list of all Activities to be displayed
	 */
	public SubActivityAdapter(Context context, int layout, ArrayList<SubActivity> list) {
		super(context, layout, list);
		this.context = context;
		this.list    = list;
	}
	
}