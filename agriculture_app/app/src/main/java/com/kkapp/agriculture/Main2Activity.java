package com.kkapp.agriculture;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;

        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import com.google.android.material.snackbar.Snackbar;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main2Activity extends AppCompatActivity {
    Spinner spinner_1;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        butt=findViewById(R.id.button);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent;
                mainIntent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(mainIntent);
                finish();
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent mainIntent;
                mainIntent = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(mainIntent);
                finish();

            }
        });

        spinner_1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add(getResources().getString(R.string.state1));
        list.add(getResources().getString(R.string.s2));
        list.add(getResources().getString(R.string.s3));
        list.add(getResources().getString(R.string.s4));
        list.add(getResources().getString(R.string.s5));
        list.add(getResources().getString(R.string.s6));
        list.add(getResources().getString(R.string.s7));
        list.add(getResources().getString(R.string.s8));
        list.add(getResources().getString(R.string.s9));
        list.add(getResources().getString(R.string.s10));
        list.add(getResources().getString(R.string.s11));
        list.add(getResources().getString(R.string.s12));
        list.add(getResources().getString(R.string.s13));
        list.add(getResources().getString(R.string.s14));
        list.add(getResources().getString(R.string.s15));
        list.add(getResources().getString(R.string.s16));
        list.add(getResources().getString(R.string.s17));
        list.add(getResources().getString(R.string.s18));
        list.add(getResources().getString(R.string.s19));
        list.add(getResources().getString(R.string.s20));
        list.add(getResources().getString(R.string.s21));
        list.add(getResources().getString(R.string.s22));
        list.add(getResources().getString(R.string.s23));
        list.add(getResources().getString(R.string.s24));
        list.add(getResources().getString(R.string.s25));
        list.add(getResources().getString(R.string.s26));
        list.add(getResources().getString(R.string.s27));
        list.add(getResources().getString(R.string.s28));
        list.add(getResources().getString(R.string.s29));
        list.add(getResources().getString(R.string.s30));
        list.add(getResources().getString(R.string.s31));
        list.add(getResources().getString(R.string.s35));
        list.add(getResources().getString(R.string.s36));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1.setAdapter(adapter);
        SharedPreferences prefs = getSharedPreferences("State", MODE_PRIVATE);
        String name = prefs.getString("state", "Orrisa");//"No name defined" is the default value.
        int idName = prefs.getInt("idName", 2);


        spinner_1.setSelection(idName);
        spinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "YOUR SELECTION IS : " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("State", MODE_PRIVATE).edit();
                editor.putString("state",parent.getItemAtPosition(position).toString());
                editor.putInt("idName", position);
                editor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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
                mainIntent = new Intent(Main2Activity.this, rain.class);
                startActivity(mainIntent);
                finish();
            }
            else if (name=="Bihar") {
                mainIntent = new Intent(Main2Activity.this, rain2.class);
                startActivity(mainIntent);
                finish();
            }
            else if (name=="Jharkhand") {
                mainIntent = new Intent(Main2Activity.this, rain3.class);
                startActivity(mainIntent);
                finish();
            }
            else if (name=="Haryana,Delhi&Chandigarh") {
                mainIntent = new Intent(Main2Activity.this, rain4.class);
                startActivity(mainIntent);
                finish();
            }
            else {
                mainIntent = new Intent(Main2Activity.this, rain5.class);
                startActivity(mainIntent);
                finish();
            }
            return true;
        }
        if (id == R.id.gov) {
            Intent mainIntent;
            mainIntent = new Intent(Main2Activity.this, Bankact.class);
            startActivity(mainIntent);
            finish();

            return true;
        }
        if (id == R.id.translate) {
            trans();

//            Locale locale=new Locale("hi-rIN");
//            Locale.setDefault(locale);
//            Configuration config =new Configuration();
//            config.locale=locale;
//            getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
//            Locale locale = new Locale("hi");
//            Locale.setDefault(locale);
//            Configuration config = getBaseContext().getResources().getConfiguration();
//            config.locale = locale;
//            getBaseContext().getResources().updateConfiguration(config,
//                    getBaseContext().getResources().getDisplayMetrics());

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("deprecation")
    private void trans() {
        Locale locale = new Locale("hi-rIN");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
    }


}
