package com.example.mdenamulhaque.fitnesstrailassistant;

import android.Manifest;
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

    public EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_free_trail);

        editText=(EditText)findViewById(R.id.editText_Search);

        //map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        try {
                        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
                        setUpMap();
            } catch (NullPointerException e) {
                        e.printStackTrace();
            }


    }

   /* public void onSearch(){
        EditText location_tf=(EditText)findViewById(R.id.editText_Search);
        //String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();
        String lo;
        //String location=location_tf.getText().toString();
        Toast.makeText(MapFreeTrail.this, location, Toast.LENGTH_LONG).show();
    }*/

    //public void onSearch(){

        //EditText location_tf=(EditText)findViewById(R.id.editText_Search);
        //String location=editText.getText().toString();

        /*List<Address> addressList=null;

        if (location!=null ||!location.equals("")){
            Geocoder geocoder=new Geocoder(this);
            try {
                addressList =geocoder.getFromLocationName(location,1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Address address=addressList.get(0);

            LatLng latLng=new LatLng(address.getLatitude(),address.getLongitude());
            map.addMarker(new MarkerOptions().position(latLng).title("New Location"));
            //map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            //map.animateCamera(CameraUpdateFactory.newLatLng(latLng));
            map.animateCamera(CameraUpdateFactory.newLatLng(latLng));

        }*/
        //Toast.makeText(MapFreeTrail.this, location, Toast.LENGTH_LONG).show();
   // }

    /*public void setUpMapIfNeeded(){
        if (map==null){
            map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        }
        if (map!=null){
            //setUpMap();
        }
    }*/

    private void setUpMap() {
        map.setMyLocationEnabled(true);
                LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
               Criteria criteria = new Criteria();
               String provider = locationManager.getBestProvider(criteria, true);
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                                //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                        //                                          int[] grantResults)
                                                                // to handle the case where the user grants the permission. See the documentation
                                                                        // for ActivityCompat#requestPermissions for more details.
                                                                                return;
                    }
                Location myLocation = locationManager.getLastKnownLocation(provider);

        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                        double latitude=myLocation.getLatitude();
                double longitude=myLocation.getLongitude();

                        LatLng latLng=new LatLng(latitude,longitude);
                map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        map.animateCamera(CameraUpdateFactory.zoomTo(20));
        map.addMarker(new MarkerOptions().position(new LatLng(latitude,longitude)).title("I am here."));

    }

}
