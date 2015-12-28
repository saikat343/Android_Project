package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
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

    DatabaseHelper myDb;
    Button btnAddData;

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

    String start_position=null;
    String start_point=null;
    String end_point=null;
    String finishing_position=null;
    String track_route1="LUX_Echter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_echternach);

        myDb=new DatabaseHelper(this);

        btnAddData=(Button)findViewById(R.id.button2_finish_echternach);

        try {
            map1 = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapEchternach)).getMap();
            Intent intent = getIntent();
            String selectedRadioValue1 = intent.getStringExtra("radioGroup1Selected");

            //------- Add Marked the specific points in the route-------------//
            if(selectedRadioValue1.equals("Walk Fast Mode")){

                start_position=point1.toString();
                start_point=point1.toString();
                end_point=point3R3.toString();
                finishing_position=point3.toString();

                //-----------------Start Here Luxembourg City--------------------//
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

                addData();
            }

            if(selectedRadioValue1.equals("Run Normally")){

                start_position=point1.toString();
                start_point=point3R3.toString();
                end_point=point3R5.toString();
                finishing_position=point3.toString();

                Marker first2 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

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

                // Add a thin Blue and Red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R3, point3R4, point3R5)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Walk and Breath Deeply")){

                start_position=point1.toString();
                start_point=point3R5.toString();
                end_point=point3R8.toString();
                finishing_position=point3.toString();

                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

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

                // Add a thin Blue and Red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R5,point3R6,point3R7,point3R8)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Again Run Normally")){

                start_position=point1.toString();
                start_point=point3R8.toString();
                end_point=point3R10.toString();
                finishing_position=point3.toString();

                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

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

                // Add a thin Blue and Red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5, point3R6,point3R7,point3R8)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R8,point3R9,point3R10)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Sprint and Walk")){

                start_position=point1.toString();
                start_point=point3R10.toString();
                end_point=point3R12.toString();
                finishing_position=point3.toString();

                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

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

                // Add a thin Blue and Red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5, point3R6,point3R7,point3R8,point3R9,point3R10)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R10,point3R11,point3R12)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }
            if(selectedRadioValue1.equals("Make Stretching Exercise")){

                start_position=point1.toString();
                start_point=point3R12.toString();
                end_point=point3.toString();
                finishing_position=point3.toString();

                Marker first_1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Luxembourg City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

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

                // Add a thin Blue and Red line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point3R1, point3R2, point3R3,point3R4,point3R5, point3R6,point3R7,point3R8,point3R9,point3R10,point3R11,point3R12)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point3R12,point3R13,point3)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEchternach.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            else {}


        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    //-----Data save into database-----------------//

    public void addData(){
        btnAddData.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(start_position.toString(),
                        start_point.toString(),
                        end_point.toString(),
                        finishing_position.toString(),
                        track_route1.toString());
                if (isInserted = true) {
                    Toast.makeText(MapEchternach.this, "Data Inserted", Toast.LENGTH_LONG).show();

                    Intent mapIntent = new Intent(MapEchternach.this, EchternachActivity.class);
                    startActivity(mapIntent);
                }
                else {
                    Toast.makeText(MapEchternach.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
