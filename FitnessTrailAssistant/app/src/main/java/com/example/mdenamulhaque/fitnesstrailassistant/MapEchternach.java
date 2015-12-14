package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

public class MapEchternach extends AppCompatActivity {

    private GoogleMap map1;

    //-----Luxembourg-------------------//
    LatLng point1 = new LatLng(49.61630634, 6.12658522);

    //-----Start--Echternach------Road---------------//
    LatLng point3 = new LatLng(49.81298973, 6.42939589);
    LatLng point3R1 = new LatLng(49.62311581, 6.15823429);
    LatLng point3R2 = new LatLng(49.64268385, 6.16647403);
    LatLng point3R3 = new LatLng(49.63912661, 6.21865909);
    LatLng point3R4 = new LatLng(49.66402184, 6.21865909);
    LatLng point3R5 = new LatLng(49.67646469, 6.25161808);
    LatLng point3R6 = new LatLng(49.704489352, 6.24063175);
    LatLng point3R7 = new LatLng(49.70844595, 6.27633732);
    LatLng point3R8 = new LatLng(49.7279797, 6.27633732);
    LatLng point3R9 = new LatLng(49.73153044, 6.31753605);
    LatLng point3R10 = new LatLng(49.75992706, 6.31753605);
    LatLng point3R11 = new LatLng(49.77234536, 6.36422794);
    LatLng point3R12 = new LatLng(49.79185339, 6.35873478);
    LatLng point3R13 = new LatLng(49.81135357, 6.39718693);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_echternach);

        try {
            map1 = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapEchternach)).getMap();
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
                    .position(point3R3)
                    .title("500m")
                    .draggable(true)
                    .snippet("Walk Fast Mode")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R3, 16));

            Marker second = map1.addMarker(new MarkerOptions()
                    .position(point3R5)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Run Normally")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R5, 16));

            Marker third = map1.addMarker(new MarkerOptions()
                    .position(point3R8)
                    .title("2min")
                    .draggable(true)
                    .snippet("Walk and Breath Deeply")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R8, 16));

            Marker fourth = map1.addMarker(new MarkerOptions()
                    .position(point3R10)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Again Run Normally")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R10, 16));

            Marker five = map1.addMarker(new MarkerOptions()
                    .position(point3R12)
                    .title("400m and 2min")
                    .draggable(true)
                    .snippet("Sprint and Walk")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R12, 16));

            Marker second_1 = map1.addMarker(new MarkerOptions()
                    .position(point3)
                    .title("Make Stretching Exercise")
                    .draggable(true)
                    .snippet("Finishing Point in Echternach City.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));*/

            //-------End Predefined Route points add------------------------//


            //-------Marked the specific points in the route-------------//
            if(selectedRadioValue1.equals("Walk Fast Mode")){

                //-----------------Test--------------------//
                Marker first1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Start with Walk Fast Mode in Luxembourg City.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker echternach_1 = map1.addMarker(new MarkerOptions()
                        .position(point3R3)
                        .title("500m")
                        .draggable(true)
                        .snippet("Finished Walk Fast Mode.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R3, 16));

                Marker second1 = map1.addMarker(new MarkerOptions()
                        .position(point3)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Echternach City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

                // Add a thin red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1,point3R2,point3R3)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
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
                        .position(point3R3)
                        .title("500m")
                        .draggable(true)
                        .snippet("Start Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R3, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point3R5)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Finished Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R5, 16));

                Marker second2 = map1.addMarker(new MarkerOptions()
                        .position(point3)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Echternach City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3)
                        .width(5)
                        .color(Color.GREEN));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R3, point3R4, point3R5)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
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
                        .position(point3R5)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Start Walk and Breath Deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R5, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point3R8)
                        .title("2min")
                        .draggable(true)
                        .snippet("Finished Walk and Breath Deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R8, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point3)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Echternach City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5)
                        .width(5)
                        .color(Color.GREEN));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R5,point3R6,point3R7,point3R8)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
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
                        .position(point3R8)
                        .title("2min")
                        .draggable(true)
                        .snippet("Start Run Normally again.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R8, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point3R10)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Finished Run Normally")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R10, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point3)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Echternach City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5, point3R6,point3R7,point3R8)
                        .width(5)
                        .color(Color.GREEN));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R8,point3R9,point3R10)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
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
                        .position(point3R10)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Start Sprint and Walk.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R10, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point3R12)
                        .title("400m and 2min")
                        .draggable(true)
                        .snippet("Finished Sprint and Walk.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R12, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point3)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Echternach City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5, point3R6,point3R7,point3R8,point3R9,point3R10)
                        .width(5)
                        .color(Color.GREEN));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R10,point3R11,point3R12)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
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
                        .position(point3R12)
                        .title("400m and 2min")
                        .draggable(true)
                        .snippet("Start Make Stretching Exercise.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R12, 16));


                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point3)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Finished Make Stretching Exercise Echternach.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

                // Add a thin Green line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5, point3R6,point3R7,point3R8,point3R9,point3R10,point3R11,point3R12)
                        .width(5)
                        .color(Color.GREEN));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R12,point3R13,point3)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();
            }

            else {}


        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
