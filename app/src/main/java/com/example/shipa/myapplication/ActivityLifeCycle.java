package com.example.shipa.myapplication;

import android.graphics.Color;
import android.os.LocaleList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class ActivityLifeCycle extends AppCompatActivity {
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(ActivityLifeCycle.this,textView);

                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();

                        if (id == R.id.yellow) {
                            textView.setTextColor(Color.YELLOW);
                        }
                        if (id == R.id.red) {
                            textView.setTextColor(Color.RED);
                        }
                        if (id == R.id.black) {
                            textView.setTextColor(Color.BLACK);
                        }


                        return true;
                    }

                });
                popupMenu.show();
            }
        });

        Log.i("My position","I am onCreate");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My position","I am onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My position","I am onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My position","I am onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My position","I am onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My position","I am onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My position","I am onDestroy");
    }
}
