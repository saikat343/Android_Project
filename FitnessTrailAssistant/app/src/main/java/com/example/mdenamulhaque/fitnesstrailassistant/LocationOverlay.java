package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

//import com.google.android.maps.ItemizedOverlay;
//import com.google.android.maps.OverlayItem;

/**
 * Created by MDENAMULHAQUE on 16/12/2015.
 */
public class LocationOverlay extends AsyncTask<Void, Integer, Boolean> {
    private static final String TOAST_MSG = "current route calculation";
    private static final String TOAST_ERR_MAJ = "Unable to find a route";

    private Context context;
    private GoogleMap gMap;
    private String editDeparture;
    private String editArrival;
    private final ArrayList<LatLng>lstLatLng= new ArrayList<LatLng>();

    /**
     * Constructeur.
     * @paramcontext
     * @paramgMap
     * @parameditDeparture
     * @parameditArrival
     */
    public LocationOverlay(final Context context, final GoogleMap gMap, final String editDeparture, final String editArrival) {
        this.context= context;
        this.gMap= gMap;
        this.editDeparture= editDeparture;
        this.editArrival= editArrival;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected void onPreExecute() {
        Toast.makeText(context, TOAST_MSG, Toast.LENGTH_LONG).show();
    }

    /***
     * {@inheritDoc}
     */
    @Override
    protected Boolean doInBackground(Void... params) {
        try {
            //Construction of the url to call
            final StringBuilder url=new StringBuilder("http://maps.googleapis.com/maps/api/directions/xml?sensor=false&language=en");
            url.append("&origin=");
            url.append(editDeparture.replace(' ', '+'));
            url.append("&destination=");
            url.append(editArrival.replace(' ', '+'));

            //Call the webservice
            final InputStream stream = new URL(url.toString()).openStream();

            //Data processing
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setIgnoringComments(true);

            final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            final Document document = documentBuilder.parse(stream);
            document.getDocumentElement().normalize();

            //We first retrieves the status of the request
            final String status = document.getElementsByTagName("status").item(0).getTextContent();
            if(!"OK".equals(status)) {
                return false;
            }

            //Recovering the steps
            final Element elementLeg = (Element) document.getElementsByTagName("leg").item(0);
            final NodeList nodeListStep = elementLeg.getElementsByTagName("step");
            final int length = nodeListStep.getLength();

            for(int i=0; i<length; i++) {
                final Node nodeStep = nodeListStep.item(i);

                if(nodeStep.getNodeType() == Node.ELEMENT_NODE) {
                    final Element elementStep = (Element) nodeStep;

                    //Points XML decoding
                    decodePolylines(elementStep.getElementsByTagName("points").item(0).getTextContent());
                }
            }

            return true;
        }
        catch(final Exception e) {
            return false;
        }
    }
    /**
     * Méthode qui décode les points en latitude et longitudes
     * @parampoints
     */
    private void decodePolylines(final String encodedPoints) {
        int index = 0;
        int lat = 0, lng = 0;

        while (index <encodedPoints.length()) {
            int b, shift = 0, result = 0;

            do {
                b = encodedPoints.charAt(index++) - 63;
                result |= (b &0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);

            int dlat = ((result &1) != 0 ? ~(result >>1) : (result >>1));
            lat += dlat;
            shift = 0;
            result = 0;

            do {
                b = encodedPoints.charAt(index++) - 63;
                result |= (b &0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);

            int dlng = ((result &1) != 0 ? ~(result >>1) : (result >>1));
            lng += dlng;

            lstLatLng.add(new LatLng((double)lat/1E5, (double)lng/1E5));
        }
    }


    @Override
    protected void onPostExecute(final Boolean result) {
        if(!result) {
            Toast.makeText(context, TOAST_ERR_MAJ, Toast.LENGTH_SHORT).show();
        }
        else {

            //It says polyline, that is to say the line (blue here) that onajoute on the map to trace the route
            final PolylineOptions polylines = new PolylineOptions();
            polylines.color(Color.BLUE);

            //On construct polyline
            for(final LatLng latLng : lstLatLng) {
                polylines.add(latLng);
            }

            //It says that a green marker will be placed on the start
            final MarkerOptions markerA = new MarkerOptions();
            markerA.position(lstLatLng.get(0));
            markerA.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

            //It says a red marker and put them on arrival
            final MarkerOptions markerB = new MarkerOptions();
            markerB.position(lstLatLng.get(lstLatLng.size()-1));
            markerB.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

            //On update the map
            gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lstLatLng.get(0), 10));
            gMap.addMarker(markerA);
            gMap.addPolyline(polylines);
            gMap.addMarker(markerB);
        }
    }

}
