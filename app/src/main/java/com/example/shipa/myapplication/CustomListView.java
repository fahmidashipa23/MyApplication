package com.example.shipa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {

    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView = findViewById(R.id.listView2);
        peoples = new ArrayList<String>();
        countries = new ArrayList<String>();

        peoples.add("Shipa");
        peoples.add("Sumaiya");
        peoples.add("Sneha");
        peoples.add("Amina");
        peoples.add("Popy");

        countries.add("America");
        countries.add("Uganda");
        countries.add("Egypt");
        countries.add("Japan");
        countries.add("India");


        ListViewAdapter adapter = new ListViewAdapter(this,peoples,countries);

        listView.setAdapter(adapter);

    }
}
