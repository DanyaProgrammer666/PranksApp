package com.example.viper_000.pranks;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class RazorScreen extends AppCompatActivity implements OnTouchListener {


    private MediaPlayer mp;
    Vibrator vibrator;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_razor_screen);


        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        final Button zero = (Button) this.findViewById(R.id.button2);
        zero.setOnTouchListener(this);


        mp = MediaPlayer.create(this, R.raw.shaver_sound);

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
        {
            Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            if ((event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN) {
                vb.vibrate(1000 * 60 * 10);//10mins
                return true;
            }
            if ((event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_UP) {
                vb.cancel();
                return false;
            }

            return true;
        }
    }
}