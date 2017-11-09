package com.example.mikea.hackathon2017alzheimer.Vue.Activites;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.mikea.hackathon2017alzheimer.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Mike AUBENAS on 09/11/2017.
 *
 * -> http://tutos-android-france.com/google-maps/
 */

public class FindThePersonActivity extends FragmentActivity
{
	View map;
	LatLng maPosition, targetPosition;
	ImageView imageTarget;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_the_person_activity);

		map = findViewById(R.id.map);
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
		imageTarget = findViewById(R.id.ivTarget);

		map.setVisibility(View.INVISIBLE);

		maPosition = new LatLng(43.668856, 7.219177);
		targetPosition = new LatLng(43.668920, 7.219156);

		setImageTarget(getResources().getDrawable( R.drawable.test_image_user ));

		mapFragment.getMapAsync(new OnMapReadyCallback()
		{
			@Override
			public void onMapReady(GoogleMap googleMap)
			{
				map.setVisibility(View.VISIBLE);


				googleMap.addMarker(new MarkerOptions().title("Vous").position(maPosition));
				googleMap.addMarker(new MarkerOptions().title("").position(targetPosition));

				googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(maPosition, 15));
				googleMap.animateCamera(CameraUpdateFactory.zoomTo(20), 2000, null);
			}
		});

	}


	//Traitement image
	private Drawable resizeTargetImage(Drawable image)
	{
		Bitmap b = ((BitmapDrawable)image).getBitmap();
		Bitmap bitmapResized = Bitmap.createScaledBitmap(b, 50, 50, false);
		return new BitmapDrawable(getResources(), bitmapResized);
	}

	private void setImageTarget(Drawable drawable)
	{
		Drawable drawableResized = resizeTargetImage(drawable);
		drawableResized.setAlpha(180);
		imageTarget.setImageDrawable(drawableResized);
	}
}
