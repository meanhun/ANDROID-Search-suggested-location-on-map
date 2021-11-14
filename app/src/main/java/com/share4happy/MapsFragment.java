package com.share4happy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends FragmentActivity implements OnMapReadyCallback {

    SupportMapFragment mapFragment;
    GoogleMap mMap;
    Marker marker;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_maps);
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        //Nhận dữ liệu được gửi qua
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("send");
        String name_address = bundle.getString("name");
        String _title = bundle.getString("title");
        Double latitude = bundle.getDouble("latitude");
        Double longtitude = bundle.getDouble("longtitude");

        switch (name_address){
            case "CS1 Lạc Hồng":
                //Tạo cửa sổ  thông tin trên marker
                mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
                    @Nullable
                    @Override
                    public View getInfoContents(@NonNull Marker marker) {
                        View view = getLayoutInflater().inflate(R.layout.infowindowlayout,null);
                        ImageView im = view.findViewById(R.id.imageView);
                        TextView tv1 = view.findViewById(R.id.nameAdress);
                        TextView tv2 = view.findViewById(R.id.snippet);

                        tv1.setText(name_address);
                        tv2.setText(_title);
                        im.setImageResource(R.drawable.cs1);
                        return view;
                    }

                    @Nullable
                    @Override
                    public View getInfoWindow(@NonNull Marker marker) {
                        return null;
                    }
                });
                //Tạo marker
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longtitude))
                        .title(name_address)
                        .snippet(_title));
                //Zoom
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,longtitude),15));
                break;
            case "CS2 Lạc Hồng":
                //Tạo cửa sổ  thông tin trên marker
                mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
                    @Nullable
                    @Override
                    public View getInfoContents(@NonNull Marker marker) {
                        View view = getLayoutInflater().inflate(R.layout.infowindowlayout,null);
                        ImageView im = view.findViewById(R.id.imageView);
                        TextView tv1 = view.findViewById(R.id.nameAdress);
                        TextView tv2 = view.findViewById(R.id.snippet);

                        tv1.setText(name_address);
                        tv2.setText(_title);
                        im.setImageResource(R.drawable.cs2);
                        return view;
                    }

                    @Nullable
                    @Override
                    public View getInfoWindow(@NonNull Marker marker) {
                        return null;
                    }
                });
                //Tạo marker
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longtitude))
                        .title(name_address)
                        .snippet(_title));
                //Zoom
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,longtitude),15));
                break;
            case "CS3 Lạc Hồng":
                //Tạo cửa sổ  thông tin trên marker
                mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
                    @Nullable
                    @Override
                    public View getInfoContents(@NonNull Marker marker) {
                        View view = getLayoutInflater().inflate(R.layout.infowindowlayout,null);
                        ImageView im = view.findViewById(R.id.imageView);
                        TextView tv1 = view.findViewById(R.id.nameAdress);
                        TextView tv2 = view.findViewById(R.id.snippet);

                        tv1.setText(name_address);
                        tv2.setText(_title);
                        im.setImageResource(R.drawable.cs3);
                        return view;
                    }

                    @Nullable
                    @Override
                    public View getInfoWindow(@NonNull Marker marker) {
                        return null;
                    }
                });
                //Tạo marker
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longtitude))
                        .title(name_address)
                        .snippet(_title));
                //Zoom
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,longtitude),15));
                break;
            case "CS4 Lạc Hồng":
                //Tạo cửa sổ  thông tin trên marker
                mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
                    @Nullable
                    @Override
                    public View getInfoContents(@NonNull Marker marker) {
                        View view = getLayoutInflater().inflate(R.layout.infowindowlayout,null);
                        ImageView im = view.findViewById(R.id.imageView);
                        TextView tv1 = view.findViewById(R.id.nameAdress);
                        TextView tv2 = view.findViewById(R.id.snippet);

                        tv1.setText(name_address);
                        tv2.setText(_title);
                        im.setImageResource(R.drawable.cs4);
                        return view;
                    }

                    @Nullable
                    @Override
                    public View getInfoWindow(@NonNull Marker marker) {
                        return null;
                    }
                });
                //Tạo marker
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longtitude))
                        .title(name_address)
                        .snippet(_title));
                //Zoom
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,longtitude),15));
                break;
            case "CS5 Lạc Hồng":
                //Tạo cửa sổ  thông tin trên marker
                mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
                    @Nullable
                    @Override
                    public View getInfoContents(@NonNull Marker marker) {
                        View view = getLayoutInflater().inflate(R.layout.infowindowlayout,null);
                        ImageView im = view.findViewById(R.id.imageView);
                        TextView tv1 = view.findViewById(R.id.nameAdress);
                        TextView tv2 = view.findViewById(R.id.snippet);

                        tv1.setText(name_address);
                        tv2.setText(_title);
                        im.setImageResource(R.drawable.cs5);
                        return view;
                    }

                    @Nullable
                    @Override
                    public View getInfoWindow(@NonNull Marker marker) {
                        return null;
                    }
                });
                //Tạo marker
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longtitude))
                        .title(name_address)
                        .snippet(_title));
                //Zoom
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,longtitude),15));
                break;

        }
    }
}