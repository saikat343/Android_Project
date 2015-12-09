package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapEttelbruck extends AppCompatActivity {
    TextView txtView;
    String hello;

    private GoogleMap map1;

    //-----Luxembourg-------------------//
    LatLng point1 = new LatLng(49.61630634, 6.12658522);

    //----Ettelbruck Road-----------------------//
    LatLng point2 = new LatLng(49.8448811, 6.10255263);
    LatLng point2R1 = new LatLng(49.62667422, 6.11978214);
    LatLng point2R2 = new LatLng(49.64268385, 6.13626163);
    LatLng point2R3 = new LatLng(49.65335402, 6.11428898);
    LatLng point2R4 = new LatLng(49.66579959, 6.13076847);
    LatLng point2R5 = new LatLng(49.67646469, 6.11154239);
    LatLng point2R6 = new LatLng(49.68535048, 6.0950629);
    LatLng point2R7 = new LatLng(49.69423465, 6.08132999);
    LatLng point2R8 = new LatLng(49.71022207, 6.10330265);
    LatLng point2R9 = new LatLng(49.72265309, 6.08132999);
    LatLng point2R10 = new LatLng(49.73508093, 6.11428898);
    LatLng point2R11 = new LatLng(49.7510549, 6.08956974);
    LatLng point2R12 = new LatLng(49.77057151, 6.07034366);
    LatLng point2R13 = new LatLng(49.78476047, 6.10330265);
    LatLng point2R14 = new LatLng(49.79894528, 6.07858341);
    LatLng point2R15 = new LatLng(49.81312593, 6.07309025);
    LatLng point2R16 = new LatLng(49.8308459, 6.07858341);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_ettelbruck);

        try {
            map1 = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapEttelbruck)).getMap();
            Intent intent = getIntent();
            String selectedRadioValue1 = intent.getStringExtra("radioGroup1Selected");

            if(selectedRadioValue1.equals("First 500m")){

                //-----------------Test--------------------//
                Marker first = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Luxembourg City")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker ettelbruck_1 = map1.addMarker(new MarkerOptions()
                        .position(point2R1)
                        .title("First 500m")
                        .draggable(true)
                        .snippet("Please walk in a fast mode.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R1, 16));

                Marker second = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Ettelbruck")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Polylines are useful for marking paths and routes on the map.
                map1.addPolyline(new PolylineOptions().geodesic(true)
                                .add(point1)  // Luxembourg
                                .add(point2R1)

                );

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }
            if(selectedRadioValue1.equals("During 2000m")){

                //-----------------Test--------------------//
                Marker first = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Luxembourg City")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R4)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R4, 16));

                Marker second = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Ettelbruck")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Polylines are useful for marking paths and routes on the map.
                map1.addPolyline(new PolylineOptions().geodesic(true)
                                .add(point1)  // Luxembourg
                                .add(point2R1)
                                .add(point2R2)
                                .add(point2R3)
                                .add(point2R4)
                );

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            if(selectedRadioValue1.equals("2min")){

                //-----------------Test--------------------//
                Marker first = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Luxembourg City")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R6)
                        .title("2min")
                        .draggable(true)
                        .snippet("Walk and breath deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R6, 16));

                Marker second = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Ettelbruck")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Polylines are useful for marking paths and routes on the map.
                map1.addPolyline(new PolylineOptions().geodesic(true)
                                .add(point1)  // Luxembourg
                                .add(point2R1)
                                .add(point2R2)
                                .add(point2R3)
                                .add(point2R4)
                                .add(point2R5)
                                .add(point2R6)
                );

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            else {}

        }catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

}
