package com.example.earthquakeapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<Earthquake> {

    public CustomArrayAdapter(Activity context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false );
        }
       Earthquake currentEarthquake =getItem(position);

        TextView magnituteTextView = (TextView) listItemView.findViewById(R.id.mg);
        magnituteTextView.setText(currentEarthquake.getMagnitude());

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.place);
        cityTextView.setText(currentEarthquake.getcity());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(currentEarthquake.getMdate());

        return listItemView;
    }
}
