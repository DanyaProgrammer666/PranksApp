package com.example.viper_000.pranks;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ElectroScreen extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {

    private MediaPlayer mp;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_electro_screen);


        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        final Button zero = (Button) this.findViewById(R.id.button8);
        zero.setOnTouchListener(this);

        Button Btn = (Button) findViewById(R.id.button12);
        Btn.setOnClickListener(this);

        mp = MediaPlayer.create(this, R.raw.stun_gun);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button12:
                Intent intent = new Intent(this, ElectroQuestion.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}