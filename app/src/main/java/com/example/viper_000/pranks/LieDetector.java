package com.example.viper_000.pranks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LieDetector extends AppCompatActivity {
    int oldValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lie_detector);
        changeTextOnce();

    }

    private void changeTextOnce() {
        final TextView changingText = (TextView)findViewById(R.id.textView2);
        Button changeTextButtonTrue = (Button)findViewById(R.id.button6);
        Button changeTextButtonFalse = (Button)findViewById(R.id.button7);
        Button changeTextButtonClear = (Button)findViewById(R.id.button5);

        changeTextButtonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText("Ложь");
            }
        });
        changeTextButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText("Правда");
            }
        });
        changeTextButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText("");
            }
        });
    }
}
