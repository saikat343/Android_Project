package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.graphics.Color;
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
import com.google.android.gms.maps.model.Polyline;
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

            //-------Predefined Route points add------------------------//
            /*Marker first_1 = map1.addMarker(new MarkerOptions()
                    .position(point1)
                    .title("Luxembourg City")
                    .draggable(true)
                    .snippet("Luxembourg City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

            Marker first = map1.addMarker(new MarkerOptions()
                    .position(point2R3)
                    .title("500m")
                    .draggable(true)
                    .snippet("Walk Fast Mode")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R3, 16));

            Marker second = map1.addMarker(new MarkerOptions()
                    .position(point2R6)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Run Normally")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R6, 16));

            Marker third = map1.addMarker(new MarkerOptions()
                    .position(point2R9)
                    .title("2min")
                    .draggable(true)
                    .snippet("Walk and Breath Deeply")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R9, 16));

            Marker fourth = map1.addMarker(new MarkerOptions()
                    .position(point2R12)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Again Run Normally")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R12, 16));

            Marker five = map1.addMarker(new MarkerOptions()
                    .position(point2R15)
                    .title("400m and 2min")
                    .draggable(true)
                    .snippet("Sprint and Walk")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R15, 16));

            Marker second_1 = map1.addMarker(new MarkerOptions()
                    .position(point2)
                    .title("Make Stretching Exercise")
                    .draggable(true)
                    .snippet("Finishing Point in Ettelbruck City.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));*/

            //-------End Predefined Route points add------------------------//

            if(selectedRadioValue1.equals("Walk Fast Mode")){

                //-----------------Test--------------------//
                Marker first1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker ettelbruck_1 = map1.addMarker(new MarkerOptions()
                        .position(point2R3)
                        .title("500m")
                        .draggable(true)
                        .snippet("Walk Fast Mode.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R3, 16));

                Marker second1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point2R1,point2R2,point2R3)
                        .width(5)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            if(selectedRadioValue1.equals("Run Normally")){

                //-----------------Test--------------------//
                Marker first2 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//

                Marker ettelbruck_1 = map1.addMarker(new MarkerOptions()
                        .position(point2R3)
                        .title("500m")
                        .draggable(true)
                        .snippet("Walk Fast Mode.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R3, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R6)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R6, 16));

                Marker second2 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point2R3,point2R4,point2R5,point2R6)
                        .width(5)
                        .color(Color.GREEN));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            if(selectedRadioValue1.equals("Walk and Breath Deeply")){

                //-----------------Test--------------------//
                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker echternach1 = map1.addMarker(new MarkerOptions()
                        .position(point2R6)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R6, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R9)
                        .title("2min")
                        .draggable(true)
                        .snippet("Walk and Breath Deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R9, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point2R6,point2R7,point2R8,point2R9)
                        .width(5)
                        .color(Color.YELLOW));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            if(selectedRadioValue1.equals("Again Run Normally")){

                //-----------------Test--------------------//
                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker echternach_1 = map1.addMarker(new MarkerOptions()
                        .position(point2R9)
                        .title("2min")
                        .draggable(true)
                        .snippet("Walk and Breath Deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R9, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R12)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Run Normally")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R12, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point2R9,point2R10,point2R11,point2R12)
                        .width(5)
                        .color(Color.MAGENTA));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            if(selectedRadioValue1.equals("Sprint and Walk")){

                //-----------------Test--------------------//
                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker echternach_1 = map1.addMarker(new MarkerOptions()
                        .position(point2R12)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Run Normally")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R12, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R15)
                        .title("400m and 2min")
                        .draggable(true)
                        .snippet("Sprint and Walk.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R15, 16));



                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point2R12,point2R13,point2R14,point2R15)
                        .width(5)
                        .color(Color.GRAY));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }
            if(selectedRadioValue1.equals("Make Stretching Exercise")){

                //-----------------Test--------------------//
                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R15)
                        .title("400m and 2min")
                        .draggable(true)
                        .snippet("Sprint and Walk.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R15, 16));


                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Make Stretching Exercise")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point2R15,point2R16,point2)
                        .width(5)
                        .color(Color.CYAN));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            else {}
            

        }catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

}
