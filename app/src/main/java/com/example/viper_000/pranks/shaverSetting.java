package com.example.viper_000.pranks;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class shaverSetting extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_shaver_setting);


        Button Btn = (Button) findViewById(R.id.button3);
        Btn.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button3:
                Intent intent = new Intent(this,RazorScreen.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
