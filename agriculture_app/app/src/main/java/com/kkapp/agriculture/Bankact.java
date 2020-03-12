package com.kkapp.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Bankact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankact);

        ListView listView =  findViewById(R.id.listView);
        List<String> bank = new ArrayList<String>();
        bank.add("Union Bank- Loan for Agribusiness \n 9891122345");
        bank.add("IDBI Bank Agri Loans \n 98911223112");
        bank.add("Punjab National bank \n 98911227112");
        bank.add("Canara Bank \n 98911223172");
        bank.add("Axis Bank \n 98911723112");
        bank.add("State Bank Of INDIA \n 87911223112");
        bank.add("Corporation Bank \n 80911223112");
        bank.add("Assam Gramin Vikas Bank \n 70911223112");
        bank.add("Bank Of Baroda \n 70911723112 ");
        bank.add("Arunachal Pradesh Rural Bank \n 98911223112");



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, bank);
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
        Intent in = new Intent(Bankact.this, Main2Activity.class);
        startActivity(in);

    }
}
