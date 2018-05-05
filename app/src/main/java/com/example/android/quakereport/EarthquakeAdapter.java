package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Caine on 3/31/2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Find  the earthquake at the given position in the list of earthqukes
        Earthquake currentEarthquake = getItem(position);

        //Find the TextView wit hthe view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.mag);
        //Display the magnitude of the curent earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getMag());
        //Find the TextView with the ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.loc);
        //Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getLoc());
        //Find the TextView with the view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        //Display the date of the current earthquake in that TextView
        dateView.setText(currentEarthquake.getDate());

        return listItemView;
    }

}
