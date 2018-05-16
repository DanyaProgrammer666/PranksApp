package com.example.viper_000.pranks;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        Button schoolBtn = (Button) findViewById(R.id.button11);
        schoolBtn.setOnClickListener(this);

        Button shaverButton = (Button) findViewById(R.id.button15);
        shaverButton.setOnClickListener(this);

        Button lieBtn = (Button) findViewById(R.id.button16);
        lieBtn.setOnClickListener(this);

        Button electroBtn = (Button) findViewById(R.id.button13);
        electroBtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button11:
                Intent intent = new Intent(this, RazorScreen.class);
                startActivity(intent);
                break;
            default:
                break;
            case R.id.button15:
                intent = new Intent(this, SchoolSound.class);
                startActivity(intent);
                break;
            case R.id.button16:
                intent = new Intent(this, LieDetector.class);
                startActivity(intent);
                break;
            case R.id.button13:
                intent = new Intent(this, ElectroScreen.class);
                startActivity(intent);
                break;
        }
    }
}
