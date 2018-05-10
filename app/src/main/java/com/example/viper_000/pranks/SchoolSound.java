package com.example.viper_000.pranks;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class SchoolSound extends AppCompatActivity implements View.OnTouchListener {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_school_sound);


        final Button zero = (Button) this.findViewById(R.id.button4);
        zero.setOnTouchListener(this);


        mp = MediaPlayer.create(this, R.raw.school_sound);
    }

    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN: {
                mp.setLooping(true);
                mp.start();
            }

            break;
            case MotionEvent.ACTION_UP: {
                mp.pause();

            }
            break;
        }

        return true;
    }

}