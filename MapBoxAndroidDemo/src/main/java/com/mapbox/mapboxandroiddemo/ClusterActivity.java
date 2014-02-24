package com.mapbox.mapboxandroiddemo;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.overlay.Icon;
import com.mapbox.mapboxsdk.overlay.Marker;
import com.mapbox.mapboxsdk.overlay.PathOverlay;
import com.mapbox.mapboxsdk.overlay.mylocation.MyLocationNewOverlay;
import com.mapbox.mapboxsdk.tileprovider.tilesource.MapboxTileLayer;
import com.mapbox.mapboxsdk.views.MapController;
import com.mapbox.mapboxsdk.views.MapView;
import com.mapbox.mapboxsdk.views.util.TilesLoadedListener;

public class ClusterActivity extends ActionBarActivity {

    private MapController mapController;
    private LatLng startingPoint = new LatLng(51f, 0f);
    private MapView mv;
    private MyLocationNewOverlay myLocationOverlay;
    private Paint paint;
    private String satellite = "brunosan.map-cyglrrfu";
    private String street = "examples.map-vyofok3q";
    private String terrain = "examples.map-zgrqqx0w";
    private String currentLayer = "terrain";
    private PathOverlay equator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mv = (MapView)findViewById(R.id.mapview);
        mapController = mv.getController();
        mv.setCenter(startingPoint).setZoom(4);
        Marker m = new Marker(mv, "Hello", "World", new LatLng(0f, 0f));
        m.setIcon(new Icon(Icon.Size.l, "bus", "000"));
        mv.addMarker(m);
    }

}
