package com.example.splashanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bnb(View view) {
        Toast.makeText(this, "BNB", Toast.LENGTH_SHORT).show();
    }

    public void xml(View view) {
        Toast.makeText(this, "XML", Toast.LENGTH_SHORT).show();
    }

    public void avax(View view) {
        Toast.makeText(this, "AVAX", Toast.LENGTH_SHORT).show();
    }

    public void atom(View view) {
        Toast.makeText(this, "ATOM", Toast.LENGTH_SHORT).show();
    }

    public void ada(View view) {
        Toast.makeText(this, "ADA", Toast.LENGTH_SHORT).show();
    }

    public void xtz(View view) {
        Toast.makeText(this, "XTZ", Toast.LENGTH_SHORT).show();
    }

    public void btc(View view) {
        Toast.makeText(this, "BTC", Toast.LENGTH_SHORT).show();
    }

    public void eth(View view) {
        Toast.makeText(this, "ETH", Toast.LENGTH_SHORT).show();
    }

    public void eos(View view) {
        Toast.makeText(this, "EOS", Toast.LENGTH_SHORT).show();
    }

    public void rune(View view) {
        Toast.makeText(this, "RUNE", Toast.LENGTH_SHORT).show();
    }
}