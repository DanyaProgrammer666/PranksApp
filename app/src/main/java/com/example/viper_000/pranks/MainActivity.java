package com.example.viper_000.pranks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton shaverButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageButton shaverButton = (ImageButton) findViewById(R.id.imageButton2);
        shaverButton.setOnClickListener(this);

    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.imageButton2:
                Intent intent = new Intent(this,RazorScreen.class);
                startActivity(intent);
                    break;
                 default:
                     break;
        }
    }
}
