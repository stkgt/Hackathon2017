package com.example.mikea.hackathon2017alzheimer.Vue.Activites;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.example.mikea.hackathon2017alzheimer.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Mike AUBENAS on 09/11/2017.
 */

public class FindThePersonActivity extends FragmentActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_the_person_activity);

		final View map = findViewById(R.id.map);
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

		map.setVisibility(View.INVISIBLE);

		final LatLng maPosition = new LatLng(43.668856, 7.219177);
		final LatLng targetPosition = new LatLng(43.668920, 7.219156);


		mapFragment.getMapAsync(new OnMapReadyCallback()
		{
			@Override
			public void onMapReady(GoogleMap googleMap)
			{
				map.setVisibility(View.VISIBLE);

				googleMap.addMarker(new MarkerOptions().title("Vous").position(maPosition));
				googleMap.addMarker(new MarkerOptions().title("").position(targetPosition));

				googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(maPosition, 15));
				googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
			}
		});

	}
}
