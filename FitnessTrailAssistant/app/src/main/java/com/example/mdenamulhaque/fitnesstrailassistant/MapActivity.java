package com.example.mdenamulhaque.fitnesstrailassistant;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.w3c.dom.Document;

import java.util.ArrayList;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



import com.google.android.gms.maps.model.LatLng;

import android.content.Context;
import android.util.Log;


public class MapActivity extends AppCompatActivity {

    //-----Luxembourg City Coordinates-------------------//
    LatLng point1 = new LatLng(49.61630634, 6.12658522);

    //---Start---Ettelbruck Road Coordinates-----------------------//
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

    //-----Start--Echternach------Road coordinates---------------//
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

    private GoogleMap map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        try {

            //-------------Get map------------------------//
            map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
            //-----------------Luxembourg city add marker --------------------//
            Marker first = map.addMarker(new MarkerOptions()
                    .position(point1)
                    .title("Luxembourg City")
                    .draggable(true)
                    .snippet("Luxembourg City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

            //---------Ettelbruck Road Add marker--------------------//

            Marker second = map.addMarker(new MarkerOptions()
                    .position(point2)
                    .title("Ettelbruck")
                    .draggable(true)
                    .snippet("Ettelbruck City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

            //---------Echternach Road Add marker--------------------//

            Marker third = map.addMarker(new MarkerOptions()
                    .position(point3)
                    .title("Echternach")
                    .draggable(true)
                    .snippet("Echternach City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));

            //------------Add polylines for both Routes------//
            map.addPolyline(new PolylineOptions().geodesic(true)
                    .add(point1)  // Luxembourg
                    .add(point2R1)
                    .add(point2R2)
                    .add(point2R3)
                    .add(point2R4)
                    .add(point2R5)
                    .add(point2R6)
                    .add(point2R7)
                    .add(point2R8)
                    .add(point2R9)
                    .add(point2R10)
                    .add(point2R11)
                    .add(point2R12)
                    .add(point2R13)
                    .add(point2R14)
                    .add(point2R15)
                    .add(point2R16)
                    .add(point2)  // Ettelbruck
            );

            map.addPolyline(new PolylineOptions().geodesic(true)
                    .add(point1)  // Luxembourg
                    .add(point3R1)
                    .add(point3R2)
                    .add(point3R3)
                    .add(point3R4)
                    .add(point3R5)
                    .add(point3R6)
                    .add(point3R7)
                    .add(point3R8)
                    .add(point3R9)
                    .add(point3R10)
                    .add(point3R11)
                    .add(point3R12)
                    .add(point3R13)
                    .add(point3)    // Echternach
            );

            //---------------End---------------------------//

        }catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

}
