package com.kkapp.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    Spinner spinnnerArea;
    Spinner spinnnerArea2;
    String month;
    EditText ed;
    Button pred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinnnerArea = (Spinner) findViewById(R.id.spinnernew);
        List<String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnnerArea.setAdapter(adapter);
        spinnnerArea.setPrompt("Choose Month");
        spinnnerArea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                month = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "YOUR SELECTION IS : " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinnnerArea2 = (Spinner) findViewById(R.id.spinnernew2);
        List<String> list2 = new ArrayList<String>();
        list2.add("Acres");
        list2.add("Hectares");
        list2.add("Biga");
        list2.add("Square Guz");
        list2.add("Square Foot");
        list2.add("Square Meter");


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnnerArea2.setAdapter(adapter2);
        spinnnerArea2.setPrompt("Choose Area Unit");
        spinnnerArea2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "YOUR SELECTION IS : " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
//        pred.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent in = new Intent(Main3Activity.this, Main4Activity.class);
//                in.putExtra("Month",month);
//                startActivity(in);
//
//            }
//        });
    }

    public void predict(View view) {
        int rain=100;
        SharedPreferences prefs = getSharedPreferences("State", MODE_PRIVATE);
        String name = prefs.getString("state", "Orrisa");
        ed=findViewById(R.id.editText);
        if(name=="Assam&Meghalya"){

            if (month=="January"){
                rain=2;
            }
            if (month=="February"){
                rain=40;
            }
            if (month=="March"){
                rain=124;
            }
            if (month=="April"){
                rain=252;
            }
            if (month=="May"){
                rain=398;
            }
            if (month=="June"){
                rain=504;
            }
            if (month=="July"){
                rain=514;
            }
            if (month=="August"){
                rain=419;
            }
            if (month=="September"){
                rain=274;
            }
            if (month=="October"){
                rain=140;
            }
            if (month=="November"){
                rain=46;
            }
            if (month=="December"){
                rain=3;
            }
        }
        else if(name=="Haryana,Delhi&Chandigarh"){
//            Toast.makeText(prediction.this,"Hello Mother..",Toast.LENGTH_LONG).show();


            if (month=="January"){
                rain=3;
            }
            if (month=="February"){
                rain=3;
            }
            if (month=="March"){
                rain=3;
            }
            if (month=="April"){
                rain=9;
            }
            if (month=="May"){
                rain=35;
            }
            if (month=="June"){
                rain=101;
            }
            if (month=="July"){
                rain=168;
            }
            if (month=="August"){
                rain=126;
            }
            if (month=="September"){
                rain=39;
            }
            if (month=="October"){
                rain=8;
            }
            if (month=="November"){
                rain=3;
            }
            if (month=="December"){
                rain=3;
            }
        }
        else if(name=="Orissa"){

            if (month=="January"){
                rain=0;
            }
            if (month=="February"){
                rain=0;
            }
            if (month=="March"){
                rain=17;
            }
            if (month=="April"){
                rain=65;
            }
            if (month=="May"){
                rain=143;
            }
            if (month=="June"){
                rain=247;
            }
            if (month=="July"){
                rain=334;
            }
            if (month=="August"){
                rain=328;
            }
            if (month=="September"){
                rain=223;
            }
            if (month=="October"){
                rain=107;
            }
            if (month=="November"){
                rain=34;
            }
            if (month=="December"){
                rain=3;
            }

        }

        else if(name=="Jharkhand"){

            if (month=="January"){
                rain=4;
            }
            if (month=="February"){
                rain=8;
            }
            if (month=="March"){
                rain=21;
            }
            if (month=="April"){
                rain=58;
            }
            if (month=="May"){
                rain=138;
            }
            if (month=="June"){
                rain=264;
            }
            if (month=="July"){
                rain=363;
            }
            if (month=="August"){
                rain=303;
            }
            if (month=="September"){
                rain=141;
            }
            if (month=="October"){
                rain=42;
            }
            if (month=="November"){
                rain=9;
            }
            if (month=="December"){
                rain=1;
            }
        }
        else{

            if (month=="January"){
                rain=4;
            }
            if (month=="February"){
                rain=2;
            }
            if (month=="March"){
                rain=6;
            }
            if (month=="April"){
                rain=32;
            }
            if (month=="May"){
                rain=96;
            }
            if (month=="June"){
                rain=207;
            }
            if (month=="July"){
                rain=318;
            }
            if (month=="August"){
                rain=304;
            }
            if (month=="September"){
                rain=167;
            }
            if (month=="October"){
                rain=57;
            }
            if (month=="November"){
                rain=10;
            }
            if (month=="December"){
                rain=4;
            }
        }
        Editable tr = ed.getText();
        if(tr.length()==0){
            Toast.makeText(getApplicationContext(), "Enter Area", Toast.LENGTH_SHORT).show();
        }
        else {
                Intent in = new Intent(Main3Activity.this, prediction.class);
                in.putExtra("Month",month);
                in.putExtra("Rain",rain);
                startActivity(in);
        }


    }

    @Override
    public void onBackPressed(){
        Intent in = new Intent(Main3Activity.this, Main2Activity.class);
        startActivity(in);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent mainIntent;
            //Select rain state
            SharedPreferences prefs = getSharedPreferences("State", MODE_PRIVATE);
            String name = prefs.getString("state", "Orrisa");
            if (name=="Assam&Meghalya") {
                mainIntent = new Intent(Main3Activity.this, rain.class);
                startActivity(mainIntent);
                finish();
            }
            else if (name=="Bihar") {
                mainIntent = new Intent(Main3Activity.this, rain2.class);
                startActivity(mainIntent);
                finish();
            }
            else if (name=="Jharkhand") {
                mainIntent = new Intent(Main3Activity.this, rain3.class);
                startActivity(mainIntent);
                finish();
            }
            else if (name=="Haryana,Delhi&Chandigarh") {
                mainIntent = new Intent(Main3Activity.this, rain4.class);
                startActivity(mainIntent);
                finish();
            }
            else {
                mainIntent = new Intent(Main3Activity.this, rain5.class);
                startActivity(mainIntent);
                finish();
            }
            return true;
        }
        if (id == R.id.gov) {
            Intent mainIntent;
            mainIntent = new Intent(Main3Activity.this, Bankact.class);
            startActivity(mainIntent);
            finish();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}




