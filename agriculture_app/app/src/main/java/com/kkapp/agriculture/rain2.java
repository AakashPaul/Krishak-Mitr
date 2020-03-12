package com.kkapp.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class rain2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain2);
    }
    @Override
    public void onBackPressed(){
        Intent in = new Intent(rain2.this, Main2Activity.class);
        startActivity(in);

    }
}
