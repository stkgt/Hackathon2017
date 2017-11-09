package com.example.mikea.hackathon2017alzheimer.Vue;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;

import com.example.mikea.hackathon2017alzheimer.R;

/**
 * Created by Mike AUBENAS on 09/11/2017.
 */

public class CameraActivity extends Activity
{
	private SensorManager sensorManager;
	private Sensor accelerometre;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		accelerometre = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, accelerometre , SensorManager.SENSOR_DELAY_NORMAL);
	}
}
