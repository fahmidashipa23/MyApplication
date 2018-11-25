package com.example.shipa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationTest extends AppCompatActivity {
    TextView text;
    Button  zoom_out, zoom_in , blink , fade_in ,fade_out;

    Animation aZoomIn,aZoomOut,aBlink,aFadeOut,aFadein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_test);

        text = findViewById(R.id.text);
        zoom_in = findViewById(R.id.zoom_in);
        zoom_out = findViewById(R.id.zoom_out);
        blink = findViewById(R.id.blink);
        fade_in = findViewById(R.id.fade_in);
        fade_out = findViewById(R.id.fade_out);

        aZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        aZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        aBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        aFadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        aFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        zoom_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setVisibility(View.VISIBLE);
                text.startAnimation(aBlink);

            }


        });

        zoom_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setVisibility(View.VISIBLE);
                text.startAnimation(aFadein);

            }


        });

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setVisibility(View.VISIBLE);
                text.startAnimation(aFadeOut);

            }


        });

        fade_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setVisibility(View.VISIBLE);
                text.startAnimation(aZoomIn);

            }


        });

        fade_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setVisibility(View.VISIBLE);
                text.startAnimation(aZoomOut);


            }


        });





    }
}
