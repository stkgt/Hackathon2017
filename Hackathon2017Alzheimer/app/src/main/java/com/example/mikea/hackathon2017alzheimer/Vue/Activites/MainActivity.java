package com.example.mikea.hackathon2017alzheimer.Vue.Activites;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mikea.hackathon2017alzheimer.R;
import com.example.mikea.hackathon2017alzheimer.Vue.Utilitaires.ActivitiesLauncher;

public class MainActivity extends AppCompatActivity
{
	private Activity activity;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btnOui = (Button) findViewById(R.id.btnOui);
		Button btnNon = (Button) findViewById(R.id.btnNon);

		activity = this;

		btnNon.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				finish();
			}
		});

		btnOui.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				ActivitiesLauncher.launchFindThePersonActivity(activity);
			}
		});
	}
}
