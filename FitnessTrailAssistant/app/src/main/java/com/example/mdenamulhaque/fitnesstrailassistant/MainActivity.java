package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //------Map Intent ok first-----------------//
    public void launchMap(View view){
        Intent mapIntent=new Intent(MainActivity.this,MapActivity.class);
        startActivity(mapIntent);
    }

    public void clickStart(View view){
        Intent trainingIntent=new Intent(MainActivity.this,TrainingInstructions.class);
        startActivity(trainingIntent);
    }

    public void clickFreeTrail(View view){
        Intent freeTrailIntent=new Intent(MainActivity.this,FreeTrail.class);
        startActivity(freeTrailIntent);
    }



}
