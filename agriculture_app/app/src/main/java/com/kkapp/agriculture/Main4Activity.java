package com.kkapp.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        ListView listView = (ListView) findViewById(R.id.listView);
        List<String> scheme = new ArrayList<String>();
        scheme.add("Soil Health Card Scheme ");
        scheme.add("Pradhan Mantri Fasal Bima Yojana (PMFBY)");
        scheme.add("Neem Coated Urea (NCU)");
        scheme.add("Pradhan Mantri Krishi Sinchai Yojana (PMKSY)");
        scheme.add("Paramparagat Krishi Vikas Yojana (PKVY)");
        scheme.add("National Agriculture Market (e-NAM)");
        scheme.add("Micro Irrigation Fund (MIF)");
        scheme.add("Rainfed Area Development Programme (RADP)");
        scheme.add("National Watershed Development Project for Rainfed Areas (NWDPRA)");
        scheme.add("Agriculture Contingency Plan");
        scheme.add("National Watershed Development Project for Rainfed Areas (NWDPRA)");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, scheme);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:9812335576"));
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:9891123212"));
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:98911722356"));
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:70911223112"));
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:98911232326"));
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:9812335576"));
                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:9812335576"));
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:8565849872"));
                    startActivity(intent);
                }

            }
        });

    }
    @Override
    public void onBackPressed(){
        Intent in = new Intent(Main4Activity.this, Main2Activity.class);
        startActivity(in);

    }
}
