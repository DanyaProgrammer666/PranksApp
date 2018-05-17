package com.example.viper_000.pranks;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.anjlab.android.iab.v3.BillingProcessor;
import com.anjlab.android.iab.v3.TransactionDetails;


public class InAppBilling extends AppCompatActivity implements BillingProcessor.IBillingHandler,View.OnClickListener {
    BillingProcessor bp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_in_app_billing);
        bp = new BillingProcessor(this, "MIIBIjANB+gkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgeYHUexKKzlLU1ZtirnyygADa36AbblIR3XjhWJJAzwSS4CmyINi2gKCX4CXXIe9T+e4bcaHgIK5eRu4hn9u9OxdH9sJbzZd0cj59HmFac29fqUhHlu5psxj3wWflzPX0CyS1Uvf3BgPO3n4YmajIBGQ6zW5dOhN5L4KQQiQIbeKDqnbXba5JJ21Lab8/yZtGV7pTBJsaY0HzMDzWflqrGnxeF+g52mYombfRpPenRFcAqNVH7m/GnbD6p8fUL58TY8eFq2MLb3ZGa9OcyzkIZ8qMQgq7w23+ml5ASQesbxSyIDnm91r5IekJl5t2ANCmfR5Y6mZi9bQK25CpchuMwIDAQAB", this);
        Button Btn = (Button) findViewById(R.id.button17);
        Btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        bp.purchase(InAppBilling.this, "viper_000.pranks");
    }

    @Override
    public void onProductPurchased(@NonNull String productId, @Nullable TransactionDetails details) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onPurchaseHistoryRestored() {

    }

    @Override
    public void onBillingError(int errorCode, @Nullable Throwable error) {

    }

    @Override
    public void onBillingInitialized() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!bp.handleActivityResult(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
    @Override
    public void onDestroy() {
        if (bp != null) {
            bp.release();
        }
        super.onDestroy();
    }

}
