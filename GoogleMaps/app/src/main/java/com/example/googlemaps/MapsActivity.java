package com.example.googlemaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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
        LatLng bugayong = new LatLng(16.0816, 120.5816);
        mMap.addMarker(new MarkerOptions().position(bugayong).title("Bugayong Integrated School").snippet("Rey Jr. D. Tacdol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bugayong));

        LatLng badipa = new LatLng(15.975840, 120.567207);
        mMap.addMarker(new MarkerOptions().position(badipa).title("Badipa National Highschool").snippet("Johncel Saraza"));

        LatLng divine = new LatLng(15.97838, 120.57583);
        mMap.addMarker(new MarkerOptions().position(divine).title("Divine World College of Urdaneta").snippet("Chesmar Obero"));




    }
}