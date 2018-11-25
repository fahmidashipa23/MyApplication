package com.example.shipa.myapplication;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Activity context;
    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListViewAdapter( Activity context, ArrayList<String> peoples, ArrayList<String> countries)
    {
        this.context = context;
        this.peoples = peoples;
        this.countries = countries;
    }
    @Override
    public int getCount() {
        return peoples.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
        {
            convertView = context.getLayoutInflater().inflate(R.layout.customlistitem, parent,false);
        }

        TextView dummytext = convertView.findViewById(R.id.textView3);
        TextView dummytext2 =convertView.findViewById(R.id.textView7);
        String peoplesText = peoples.get(position).toString();
        String countryText = countries.get(position).toString();
        dummytext.setText(peoplesText);
        dummytext2.setText(countryText);
        return convertView;
    }
}
