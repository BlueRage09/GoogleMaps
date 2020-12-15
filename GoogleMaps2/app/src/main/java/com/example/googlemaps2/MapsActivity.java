package com.example.googlemaps2;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Bugayong and move the camera
        LatLng casubiduan = new LatLng(16.089516, 120.582829);
        mMap.addMarker(new MarkerOptions().position(casubiduan).title("Casubiduan").snippet("Rey Jr. D. Tacdol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(casubiduan));
        LatLng poblacion = new LatLng(15.970590, 120.568950);
        mMap.addMarker(new MarkerOptions().position(poblacion).title("Poblacion").snippet("Johncel Saraza"));
        LatLng cabaolangan = new LatLng(15.970590, 120.568950);
        mMap.addMarker(new MarkerOptions().position(cabaolangan).title("Cbaolangan Sur").snippet("Chesmar Obero"));
        LatLng ucu = new LatLng(15.970590, 120.568950);
        mMap.addMarker(new MarkerOptions().position(ucu).title("Urdaneta City University").snippet("UCU"));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.089516, 120.582829))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 0, 0, 255)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.970590, 120.568950))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.892870807728023, 120.63403173907703))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9809692,120.560620))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.089516, 120.582829),
                        new LatLng(16.089635, 120.582675),
                        new LatLng(16.089359, 120.582443),
                        new LatLng(16.087725, 120.5818817),
                        new LatLng(16.087842, 120.581222),
                        new LatLng(16.087355, 120.581045),
                        new LatLng(16.086067, 120.579365),
                        new LatLng(16.078857, 120.583558),
                        new LatLng(16.076095, 120.586190),
                        new LatLng(16.071845, 120.588898),
                        new LatLng(16.068016, 120.589519),
                        new LatLng(16.061770, 120.589594),
                        new LatLng(15.979118, 120.570986),
                        new LatLng(15.978853, 120.565599),
                        new LatLng(15.98171, 120.560137),
                        new LatLng(15.980597,120.56069))
                .width(10)
                .color(Color.BLUE));
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.970590, 120.568950),
                        new LatLng(15.970161, 120.585141),
                        new LatLng(15.973376, 120.584515),
                        new LatLng(15.973578, 120.584728),
                        new LatLng(15.974606, 120.584783),
                        new LatLng(15.976805, 120.585020),
                        new LatLng(15.975866, 120.574357),
                        new LatLng(15.975928, 120.570730),
                        new LatLng(15.979253, 120.570991),
                        new LatLng(15.978930, 120.565683),
                        new LatLng(15.98171, 120.560137),
                        new LatLng(15.980597,120.56069))
                .width(10)
                .color(Color.YELLOW));
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.892870807728023, 120.63403173907703),
                        new LatLng(15.89273, 120.63300),
                        new LatLng(15.89384, 120.63142),
                        new LatLng(15.89427, 120.63050),
                        new LatLng(15.89586, 120.62844),
                        new LatLng(15.89632, 120.62808),
                        new LatLng(15.89784, 120.62563),
                        new LatLng(15.89788, 120.62264),
                        new LatLng(15.89379, 120.614008),
                        new LatLng(15.889308, 120.608533),
                        new LatLng(15.886000, 120.602391),
                        new LatLng(15.885512, 120.597548),
                        new LatLng(15.897033, 120.590767),
                        new LatLng(15.898611, 120.589391),
                        new LatLng(15.906179, 120.585250),
                        new LatLng(15.911320, 120.584247),
                        new LatLng(15.927212, 120.580738),
                        new LatLng(15.929868, 120.580682),
                        new LatLng(15.932342, 120.581157),
                        new LatLng(15.944020, 120.580588),
                        new LatLng(15.946772, 120.579796),
                        new LatLng(15.964034, 120.573048),
                        new LatLng(15.974390, 120.570827),
                        new LatLng(15.975827, 120.570692),
                        new LatLng(15.975567, 120.563741),
                        new LatLng(15.979981, 120.563436),
                        new LatLng(15.98171, 120.560137),
                        new LatLng(15.980597,120.56069))
                .width(10)
                .color(Color.GREEN));


    }
}