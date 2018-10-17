package com.example.shipa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class OptionMenuWithImage extends AppCompatActivity {

    RelativeLayout relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_with_image);

        relative = findViewById(R.id.relative);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.flower) {
            relative.setBackgroundResource(R.drawable.flower);
        }
        if (id == R.id.tree) {
            relative.setBackgroundResource(R.drawable.tree);
        }

        if (id == R.id.logout) {
            Toast.makeText(this, "logging out", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
