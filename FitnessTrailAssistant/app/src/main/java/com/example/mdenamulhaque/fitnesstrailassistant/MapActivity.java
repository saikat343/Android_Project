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

    //-----------First ok-----------------//
    //-33.867, 151.206
    //private static final LatLng DAVAO = new LatLng(7.0722, 125.6131);
    //private static final LatLng SYDNEY = new LatLng(-33.867, 151.206);

    //------------Test-----------------//
    //lat="49.7825175" lon="6.3533937"
    //lat="49.7824989" lon="6.3533055
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

    //Echternach---------Road---------------//
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





    //LatLng start = new LatLng(13.744246499553903, 100.53428772836924);
    //LatLng end = new LatLng(13.751279688694071, 100.54316081106663);

    private GoogleMap map;
    //-----------End----------------------//

   //sta tic final LatLng MELBOURNE = new LatLng(-37.813, 144.962);
    //private GoogleMap mMap;

    //-----------Test-------------------------//
    //-----------End--------------------------//




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        /*MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);*/


        try {

            //-------------First ok------------------------//
            map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
            /*Marker sydney = map.addMarker(new MarkerOptions().position(SYDNEY).title("Sydney").snippet("The most populous city in Australia."));
            // zoom in the camera to Davao city
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(SYDNEY, 16));
            // animate the zoom process
            map.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);*/

            /*Marker start1 = map.addMarker(new MarkerOptions().position(start).title("Sydney1").snippet("The most populous city in Australia."));
            // zoom in the camera to Davao city
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(start, 16));
            // animate the zoom process
            map.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

            Marker start2 = map.addMarker(new MarkerOptions().position(end).title("Sydney2").snippet("The most populous city in Australia."));
            // zoom in the camera to Davao city
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(end, 16));
            // animate the zoom process
            map.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

           // map.animateCamera(CameraUpdateFactory.newLatLng(start2.getPosition()));

            MarkerOptions markerOptions = new MarkerOptions().position(start).title(
                    "Current Location").draggable(true);
            map.addMarker(markerOptions);*/

            //-----------------Test--------------------//
            Marker first = map.addMarker(new MarkerOptions()
                    .position(point1)
                    .title("Luxembourg City")
                    .draggable(true)
                    .snippet("Luxembourg City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

            //---------Ettelbruck Road Add marker--------------------//
           /* Marker ettelbruck_1 = map.addMarker(new MarkerOptions()
                    .position(point2R1)
                    .title("First 500m")
                    .draggable(true)
                    .snippet("Please walk in a fast mode.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R1, 16));
            Marker ettelbruck_2 = map.addMarker(new MarkerOptions()
                    .position(point2R4)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Run normally.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R4, 16));
            Marker ettelbruck_3 = map.addMarker(new MarkerOptions()
                    .position(point2R5)
                    .title("2 min")
                    .draggable(true)
                    .snippet("Walk and breath deeply.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R5, 16));
            Marker ettelbruck_4 = map.addMarker(new MarkerOptions()
                    .position(point2R9)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Run normally.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R9, 16));
            Marker ettelbruck_5 = map.addMarker(new MarkerOptions()
                    .position(point2R10)
                    .title("400m")
                    .draggable(true)
                    .snippet("Sprint")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R10, 16));
            Marker ettelbruck_6 = map.addMarker(new MarkerOptions()
                    .position(point2R13)
                    .title("2 min")
                    .draggable(true)
                    .snippet("Walk")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R13, 16));
            Marker ettelbruck_7 = map.addMarker(new MarkerOptions()
                    .position(point2R14)
                    .title("Exercise")
                    .draggable(true)
                    .snippet("Make stretching exercise.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R14, 16));*/
            Marker second = map.addMarker(new MarkerOptions()
                    .position(point2)
                    .title("Ettelbruck")
                    .draggable(true)
                    .snippet("Ettelbruck City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

            //---------Echternach Road Add marker--------------------//
            /*Marker echternach_1 = map.addMarker(new MarkerOptions()
                    .position(point3R1)
                    .title("First 500m")
                    .draggable(true)
                    .snippet("Please walk in a fast mode.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R1, 16));
            Marker echternach_2 = map.addMarker(new MarkerOptions()
                    .position(point3R4)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Run normally.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R4, 16));
            Marker echternach_3 = map.addMarker(new MarkerOptions()
                    .position(point3R5)
                    .title("2 min")
                    .draggable(true)
                    .snippet("Walk and breath deeply.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R5, 16));
            Marker echternach_4 = map.addMarker(new MarkerOptions()
                    .position(point3R8)
                    .title("2000m")
                    .draggable(true)
                    .snippet("Run normally.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R8, 16));
            Marker echternach_5 = map.addMarker(new MarkerOptions()
                    .position(point3R9)
                    .title("400m")
                    .draggable(true)
                    .snippet("Sprint")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R9, 16));
            Marker echternach_6 = map.addMarker(new MarkerOptions()
                    .position(point3R10)
                    .title("2 min")
                    .draggable(true)
                    .snippet("Walk")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R10, 16));
            Marker echternach_7 = map.addMarker(new MarkerOptions()
                    .position(point3R11)
                    .title("Exercise")
                    .draggable(true)
                    .snippet("Make stretching exercise.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3R11, 16));*/
            Marker third = map.addMarker(new MarkerOptions()
                    .position(point3)
                    .title("Echternach")
                    .draggable(true)
                    .snippet("Echternach City in Luxembourg.")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(point3, 16));
            /*Marker melbourne = mMap.addMarker(new MarkerOptions()
                    .position(MELBOURNE)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));*/
            /*private void updatePolyLine(LatLng latLng) {
                List<LatLng> points = polyLine.getPoints();
                points.add(latLng);
                polyLine.setPoints(points);
            }*/

            // Polylines are useful for marking paths and routes on the map.
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

            //----------------End----------------------//
            // Polylines are useful for marking paths and routes on the map.
            /*map.addPolyline(new PolylineOptions().geodesic(true)
                    .add(start)  // Sydney
                    .add(end)  // Fiji
            );*/


            //---------------End---------------------------//

        }catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    /*@Override
    public void onMapReady(GoogleMap map) {
        LatLng sydney = new LatLng(-33.867, 151.206);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));

        map.addMarker(new MarkerOptions()
                .title("Sydney")
                .snippet("The most populous city in Australia.")
                .position(sydney));
    }*/

    //-----------------Test---------------------//

    //-----------------End----------------------//

}
