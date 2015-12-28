package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class FreeTrail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_trail);
    }

    public void clickFreeTrail(View view){

        //RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup_1);
        //String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();

        EditText editDeparture=(EditText) findViewById(R.id.editText_departure);
        String departurevalue=editDeparture.getText().toString();
        EditText editArrival=(EditText)findViewById(R.id.editText2_arrival);
        String arrivalvalue=editArrival.getText().toString();

        Intent mapFreeTrailIntent=new Intent(FreeTrail.this,MapFreeTrail.class);
        //------Send data------//
        mapFreeTrailIntent.putExtra("departureValue", departurevalue);
        mapFreeTrailIntent.putExtra("arraivalValue",arrivalvalue);
        startActivity(mapFreeTrailIntent);
    }

}
