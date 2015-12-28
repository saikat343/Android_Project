package com.example.mdenamulhaque.fitnesstrailassistant;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapFreeTrail extends AppCompatActivity {

    private GoogleMap map;

    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_free_trail);

        //----Receive data---------//
        Intent intent = getIntent();
        String getDepartureValue = intent.getStringExtra("departureValue");
        String getArrivalue=intent.getStringExtra("arraivalValue");

        //----------Get map-------------------//
        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        //---------Call locationOverlay class-------------------//
        new LocationOverlay(this ,  map,   getDepartureValue,   getArrivalue).execute();

        Toast.makeText(MapFreeTrail.this, getDepartureValue, Toast.LENGTH_LONG).show();
        Toast.makeText(MapFreeTrail.this, getArrivalue, Toast.LENGTH_LONG).show();

    }


}
