package com.example.earthquakeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        //Log.v("check", "I am in");
        earthquakes.add(new Earthquake( "4.5","San Francisco","Feb 2, 2016"));
        earthquakes.add(new Earthquake( "4.5","San Francisco","Feb 2, 2016"));
        earthquakes.add(new Earthquake( "4.5","San Francisco","Feb 2, 2016"));
        earthquakes.add(new Earthquake( "4.5","San Francisco","Feb 2, 2016"));
        earthquakes.add(new Earthquake( "4.5","San Francisco","Feb 2, 2016"));


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

//        // Create a new {@link ArrayAdapter} of earthquakes
//        ArrayAdapter<Earthquake> adapter = new ArrayAdapter<Earthquake>(
//                this, android.R.layout.simple_list_item_1, earthquakes);

        CustomArrayAdapter adapter = new CustomArrayAdapter(this, earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}