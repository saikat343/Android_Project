package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

/**
 * Created by MDENAMULHAQUE on 16/12/2015.
 */
public class LocationOverlay extends ItemizedOverlay<OverlayItem> {
    private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
    private Context mContext;

    public LocationOverlay(Drawable defaultMarker,Context context) {
        super(boundCenterBottom(defaultMarker));
        mContext = context;

    }

    // Executed, when populate() method is called
    @Override
    protected OverlayItem createItem(int arg0) {
        return mOverlays.get(arg0);
    }

    @Override
    public int size() {
        return mOverlays.size();
    }

    public void addOverlay(OverlayItem overlay){
        mOverlays.add(overlay);
        populate(); // Invokes the method createItem()
    }

    @Override
    protected boolean onTap(int arg0) {
        // Getting the tapped item
        OverlayItem item = getItem(arg0);

        Toast.makeText(mContext, item.getSnippet(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
