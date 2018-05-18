package com.example.viper_000.pranks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class InAppBilling extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_in_app_billing);
        Button Btn1 = (Button) findViewById(R.id.btn1);
        Btn1.setOnClickListener(this);
        Button Btn2 = (Button) findViewById(R.id.btn2);
        Btn2.setOnClickListener(this);
        Button Btn3 = (Button) findViewById(R.id.btn3);
        Btn3.setOnClickListener(this);
        Button Btn4 = (Button) findViewById(R.id.btn4);
        Btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent intent = new Intent(this, RazorScreen.class);
                startActivity(intent);
                break;
            default:
                break;
            case R.id.btn2:
                intent = new Intent(this, PayAlert.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                intent = new Intent(this, PayAlert.class);
                startActivity(intent);
                break;
            case R.id.btn4:
                intent = new Intent(this, PayAlert.class);
                startActivity(intent);
                break;
        }
    }
}