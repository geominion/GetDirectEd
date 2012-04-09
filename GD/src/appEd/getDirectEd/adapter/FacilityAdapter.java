package appEd.getDirectEd.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;
import appEd.getDirectEd.model.Facility;

/**
 * @author James
 *
 * Facility Adapter set up for making more specialized adapters
 */
public class FacilityAdapter extends ArrayAdapter<Facility> {
	/**
	 * Private values that can be used by extended classes
	 */
	protected final Context context;
	protected final ArrayList<Facility> list;
	
	/**
	 * FacilityAdapter constructor
	 * @param context - context in which the adapter is working
	 * @param layout - the layout being used by this adapter
	 * @param list - the list of all Facilities to be displayed
	 */
	public FacilityAdapter(Context context, int layout, ArrayList<Facility> list) {
		super(context, layout, list);
		this.context = context;
		this.list    = list;
	}
	
}