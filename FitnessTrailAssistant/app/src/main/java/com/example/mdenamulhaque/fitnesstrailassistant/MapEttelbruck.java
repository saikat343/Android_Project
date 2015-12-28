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
    DatabaseHelper myDb;
    Button btnAddData;

    private GoogleMap map1;

    //-----Luxembourg coordinates-------------------//
    LatLng point1 = new LatLng(49.61630634, 6.12658522);

    //----Ettelbruck Road coordinates-----------------------//
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

    String start_position=null;
    String start_point=null;
    String end_point=null;
    String finishing_position=null;
    String track_route1="LUX_Ettel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_ettelbruck);

        myDb=new DatabaseHelper(this);

        btnAddData=(Button)findViewById(R.id.button2_finish_ettelbruck);
        //addData();

        try {
            map1 = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapEttelbruck)).getMap();
            Intent intent = getIntent();
            String selectedRadioValue1 = intent.getStringExtra("radioGroup1Selected");


            //------- Add Marked the specific points in the route-------------//

            if(selectedRadioValue1.equals("Walk Fast Mode")){

                start_position=point1.toString();
                start_point=point1.toString();
                end_point=point2R3.toString();
                finishing_position=point2.toString();

                Marker first1 = map1.addMarker(new MarkerOptions()
                        .position(point1)
                        .title("Start Position")
                        .draggable(true)
                        .snippet("Start with Walk Fast Mode in Luxembourg City.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 16));

                //---------Ettelbruck Road Add marker--------------------//
                Marker ettelbruck_1 = map1.addMarker(new MarkerOptions()
                        .position(point2R3)
                        .title("500m")
                        .draggable(true)
                        .snippet("Finished Walk Fast Mode.")
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
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Run Normally")){

                start_position=point1.toString();
                start_point=point2R3.toString();
                end_point=point2R6.toString();
                finishing_position=point2.toString();

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
                        .snippet("Start Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R3, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R6)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Finished Run normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R6, 16));

                Marker second2 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Blue and Red  line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point2R1, point2R2,point2R3)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point2R3,point2R4,point2R5,point2R6)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Walk and Breath Deeply")){
                start_position=point1.toString();
                start_point=point2R6.toString();
                end_point=point2R9.toString();
                finishing_position=point2.toString();

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
                        .snippet("Start Walk and Breath Deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R6, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R9)
                        .title("2min")
                        .draggable(true)
                        .snippet("Finished Walk and Breath Deeply.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R9, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Blue and Red  line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point2R1, point2R2,point2R3,point2R4,point2R5,point2R6)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point2R6,point2R7,point2R8,point2R9)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Again Run Normally")){

                start_position=point1.toString();
                start_point=point2R9.toString();
                end_point=point2R12.toString();
                finishing_position=point2.toString();

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
                        .snippet("Start Run Normally again.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R9, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R12)
                        .title("2000m")
                        .draggable(true)
                        .snippet("Finished Run Normally.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R12, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Blue and Red  line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point2R1, point2R2,point2R3,point2R4,point2R5,point2R6,point2R7,point2R8,point2R9)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point2R9,point2R10,point2R11,point2R12)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            if(selectedRadioValue1.equals("Sprint and Walk")){

                start_position=point1.toString();
                start_point=point2R12.toString();
                end_point=point2R15.toString();
                finishing_position=point2.toString();

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
                        .snippet("Start Sprint and Walk.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R12, 16));

                Marker echternach_2 = map1.addMarker(new MarkerOptions()
                        .position(point2R15)
                        .title("400m and 2min")
                        .draggable(true)
                        .snippet("Finished Sprint and Walk.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R15, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Ettelbruck City in Luxembourg.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Blue and Red  line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point2R1, point2R2,point2R3,point2R4,point2R5,point2R6,point2R7,point2R8,point2R9,point2R10,point2R11,point2R12)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point2R12,point2R13,point2R14,point2R15)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }
            if(selectedRadioValue1.equals("Make Stretching Exercise")){

                start_position=point1.toString();
                start_point=point2R15.toString();
                end_point=point2.toString();
                finishing_position=point2.toString();

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
                        .snippet("Start Make Stretching Exercise")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2R15, 16));

                Marker second_1 = map1.addMarker(new MarkerOptions()
                        .position(point2)
                        .title("Finishing Position")
                        .draggable(true)
                        .snippet("Finished Make Stretching Exercise in Ettelbruck.")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                map1.moveCamera(CameraUpdateFactory.newLatLngZoom(point2, 16));

                // Add a thin Blue and Red  line.
                Polyline line = map1.addPolyline(new PolylineOptions()
                        .add(point1, point2R1, point2R2,point2R3,point2R4,point2R5,point2R6,point2R7
                                ,point2R8,point2R9,point2R10,point2R11,point2R12,point2R13,point2R14,point2R15)
                        .width(5)
                        .color(Color.BLUE));
                Polyline line1 = map1.addPolyline(new PolylineOptions()
                        .add(point2R15,point2R16,point2)
                        .width(10)
                        .color(Color.RED));

                Toast.makeText(MapEttelbruck.this, selectedRadioValue1, Toast.LENGTH_LONG).show();

                addData();
            }

            else {}

        }catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    //---------Save data into database-----//
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
                    Toast.makeText(MapEttelbruck.this, "Data Inserted", Toast.LENGTH_LONG).show();

                    Intent mapIntent = new Intent(MapEttelbruck.this, EttelbruckActivity.class);
                    startActivity(mapIntent);
                }
                else {
                    Toast.makeText(MapEttelbruck.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
