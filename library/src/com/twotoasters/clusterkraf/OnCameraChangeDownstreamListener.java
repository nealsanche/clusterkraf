package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.GoogleMap;

/**
 * Because Clusterkraf must set its own OnCameraChangeListener on the
 * GoogleMap it is managing, and because the GoogleMap can only have one
 * OnCameraChangeListener, Clusterkraf passes the event downstream to its
 * users.
 */
public interface OnCameraChangeDownstreamListener extends GoogleMap.OnCameraChangeListener {
}
