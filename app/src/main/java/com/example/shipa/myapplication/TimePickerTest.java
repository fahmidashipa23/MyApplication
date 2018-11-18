package com.example.shipa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerTest extends AppCompatActivity {

    TimePicker timepicker;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timepicker = findViewById(R.id.timePicker2);
        textview = findViewById(R.id.textView2);

        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textview.setText(hourOfDay+";"+minute);

            }
        });


    }
}
