package com.kkapp.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class rain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain);
    }
    @Override
    public void onBackPressed(){
        Intent in = new Intent(rain.this, Main2Activity.class);
        startActivity(in);

    }
}
