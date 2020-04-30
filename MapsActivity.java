package com.example.contohmaps;

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

        LatLng spbu = new LatLng(-6.998734, 113.866162);
        mMap.addMarker(new MarkerOptions().position(spbu).title("SPBU Pertamina"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu));

        LatLng resto = new LatLng(-7.012994, 113.873488);
        mMap.addMarker(new MarkerOptions().position(resto).title("Warunk Upnormal Sumenep"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(resto));

        LatLng wisata = new LatLng(-6.918802, 114.065411);
        mMap.addMarker(new MarkerOptions().position(wisata).title("Pantai Lombang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wisata));

        LatLng polres = new LatLng(-7.017117, 113.871992);
        mMap.addMarker(new MarkerOptions().position(polres).title("Polres Sumenep"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polres));

        LatLng dinas = new LatLng(-7.016362, 113.871692);
        mMap.addMarker(new MarkerOptions().position(dinas).title("Dinas Perindustrian dan Perdagangan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dinas));

        LatLng sma = new LatLng(-7.017970, 113.875694);
        mMap.addMarker(new MarkerOptions().position(sma).title("SMA Negeri 1 Sumenep"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sma));
    }
}
