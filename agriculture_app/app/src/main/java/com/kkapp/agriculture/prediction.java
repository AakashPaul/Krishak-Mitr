package com.kkapp.agriculture;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class prediction extends AppCompatActivity {
    String month;
    int rain;
    TextView crop1,crop2,crop3,crop4,pest1,pest2,pest3,pest4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction);
        SharedPreferences prefs = getSharedPreferences("State", MODE_PRIVATE);
        String name = prefs.getString("state", "Orrisa");
        Intent intent = getIntent();
        month = intent.getStringExtra("Month");
        rain=intent.getIntExtra("Rain",100);
//        Toast.makeText(prediction.this,"State"+name+"Month"+month,Toast.LENGTH_LONG).show();
        crop1=findViewById(R.id.crop1);
        crop2=findViewById(R.id.crop2);
        crop3=findViewById(R.id.crop3);
        crop4=findViewById(R.id.crop4);
        pest1=findViewById(R.id.pest);
        pest2=findViewById(R.id.pest2);
        pest3=findViewById(R.id.pest3);
        pest4=findViewById(R.id.pest4);



        if(rain<30){
            crop1.setText("Bajra");
            crop2.setText("Jawar");
            crop3.setText("Wheat");
            crop4.setText("Millets");
            pest1.setText("Carbendazamin");
            pest1.setText("Carbaryl");
            pest1.setText("Diazinon");
            pest1.setText("Phorate");
        }
        else if(rain>30 && rain<75){
            crop1.setText("Pulses,Millets");
            crop2.setText("Oil Seeds");
            crop3.setText("Wheat");
            crop4.setText("Maize");
            pest1.setText("Acetamaprid");
            pest1.setText("Dicofol");
            pest1.setText("Diazinon");
            pest1.setText("Endosulfan");
        }
        else if(rain>50 && rain<100){
            crop1.setText("Cotton");
            crop2.setText("Tobacco");
            crop3.setText("Oil Seeds");
            crop4.setText("Maize");
            pest1.setText("Aldicarb");
            pest1.setText("Dicofol");
            pest1.setText("Monocrotophos");
            pest1.setText("Malathion");
        }
        else if(rain>100 && rain<200){
            crop1.setText("Tea");
            crop2.setText("Jute");
            crop3.setText("Turmeric");
            crop4.setText("Maize");
            pest1.setText("Aldicarb");
            pest1.setText("Dicofol");
            pest1.setText("Monocrotophos");
            pest1.setText("Malathion");
        }
        else if(rain>200){
            crop1.setText("Rice");
            crop2.setText("Rubber");
            crop3.setText("Coconut");
            crop4.setText("Tea");
            pest1.setText("Chlorpyrifos");
            pest1.setText("Dicofol");
            pest1.setText("Endosulfan");
            pest1.setText("Diazinon");
        }

    }

    @Override
    public void onBackPressed(){
        Intent in = new Intent(prediction.this, Main3Activity.class);
        startActivity(in);

    }

    public void bestCrop(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Most Profitable Crops")
                .setMessage("-> Rice \n->Wheat \n->Maize \n->Mustartd \n->Cotton")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.


                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.star_on)
                .show();
    }

    public void bestPrac(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Best Pesticides industries")
                .setMessage("-> Amico \n->Bayer \n->PI industries \n->Nacl Industries \n->Dhanuka Agritech")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.


                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.star_on)
                .show();
    }
}
