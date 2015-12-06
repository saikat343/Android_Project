package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TrainingInstructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_instructions);

    }
    public void clickLuxEttel(View view){
        Intent ettelbruckIntent=new Intent(TrainingInstructions.this,EttelbruckActivity.class);
        startActivity(ettelbruckIntent);
    }

    public void clickEchternach(View view){
        Intent echternachIntent=new Intent(TrainingInstructions.this,EchternachActivity.class);
        startActivity(echternachIntent);

    }

}
