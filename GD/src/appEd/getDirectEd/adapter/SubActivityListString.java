package appEd.getDirectEd.adapter;

import java.util.ArrayList;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import appEd.getDirectEd.main.R;
import appEd.getDirectEd.model.SubActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

public class SubActivityListString extends SubActivityAdapter {

	public SubActivityListString(Context context, ArrayList<SubActivity> list) {
		super(context, R.layout.textview, list);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.textview, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.textview_text);
		textView.setText(list.get(position).getName());
 
		return rowView;
	}

}
