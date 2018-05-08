package com.example.viper_000.pranks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageButton schoolBtn = (ImageButton) findViewById(R.id.imageButton);
        schoolBtn.setOnClickListener(this);

        ImageButton shaverButton = (ImageButton) findViewById(R.id.imageButton2);
        shaverButton.setOnClickListener(this);

        ImageButton lieBtn = (ImageButton) findViewById(R.id.imageButton4);
        lieBtn.setOnClickListener(this);

        ImageButton electroBtn = (ImageButton) findViewById(R.id.imageButton3);
        electroBtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton2:
                Intent intent = new Intent(this, RazorScreen.class);
                startActivity(intent);
                break;
            default:
                break;
            case R.id.imageButton:
                intent = new Intent(this, SchoolSound.class);
                startActivity(intent);
                break;
            case R.id.imageButton4:
                intent = new Intent(this, LieDetector.class);
                startActivity(intent);
                break;
            case R.id.imageButton3:
                intent = new Intent(this, ElectroScreen.class);
                startActivity(intent);
                break;
        }
    }
}
