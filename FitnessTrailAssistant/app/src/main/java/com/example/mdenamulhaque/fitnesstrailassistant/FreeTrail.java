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
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class FreeTrail extends AppCompatActivity {
    //private TextView tvLocation;
    // Default Latitude
    //private int latitude = 28426365;

    // Default Longitude
    //private int longitude = 77320393;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_trail);

        //-----------------------------------------------------------------//
        
        //-----------------------------------------------------------------//

       // try {
            /*tvLocation = (TextView) findViewById(R.id.textView5);
            Geocoder geo = new Geocoder(FreeTrail.this.getApplicationContext(), Locale.getDefault());
            List<Address> addresses = geo.getFromLocation(latitude, longitude, 1);
            if (addresses.isEmpty()) {
                tvLocation.setText("Waiting for Location");
            }
            else {
                if (addresses.size() > 0) {
                    tvLocation.setText(addresses.get(0).getFeatureName() + ", " + addresses.get(0).getLocality() +", " + addresses.get(0).getAdminArea() + ", " + addresses.get(0).getCountryName());
                    //Toast.makeText(getApplicationContext(), "Address:- " + addresses.get(0).getFeatureName() + addresses.get(0).getAdminArea() + addresses.get(0).getLocality(), Toast.LENGTH_LONG).show();
                }
            }*/


        /*}catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    public void clickFreeTrail(View view){
        Intent mapFreeTrailIntent=new Intent(FreeTrail.this,MapFreeTrail.class);
        startActivity(mapFreeTrailIntent);
    }

}
