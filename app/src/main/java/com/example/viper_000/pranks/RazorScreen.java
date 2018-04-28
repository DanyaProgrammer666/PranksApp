package com.example.viper_000.pranks;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RazorScreen extends AppCompatActivity implements View.OnClickListener{
    ImageButton backBtn;
    Button playSoundBtn;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_razor_screen);

        ImageButton backBtn = (ImageButton) findViewById(R.id.imageButton);
        backBtn.setOnClickListener(this);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.shaver_sound);
        Button playSoundBtn = (Button)findViewById(R.id.button2);
        playSoundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }




    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}