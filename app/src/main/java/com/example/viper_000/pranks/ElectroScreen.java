package com.example.viper_000.pranks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ElectroScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_electro_screen);
    }
}
