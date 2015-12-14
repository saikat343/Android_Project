package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EchternachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echternach);
    }

    public void clickShowItinerary1(View view){
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup_1);
        String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();

        Intent mapEttelbruckIntent=new Intent(EchternachActivity.this,MapEchternach.class);
        mapEttelbruckIntent.putExtra("radioGroup1Selected", selectedRadioValue);
        startActivity(mapEttelbruckIntent);
    }

}
