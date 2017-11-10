package com.example.mikea.hackathon2017alzheimer.Vue.Activites;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.mikea.hackathon2017alzheimer.R;
import com.example.mikea.hackathon2017alzheimer.Vue.Utilitaires.ActivitiesLauncher;

/**
 * Created by Mike AUBENAS on 10/11/2017.
 */

public class FakeNotificationActivity extends Activity
{
	Activity activity;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fake_notification_activity);

		ImageView imageView = findViewById(R.id.image);

		View decorView = getWindow().getDecorView();
		// Hide both the navigation bar and the status bar.
		// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
		// a general rule, you should design your app to hide the status bar whenever you
		// hide the navigation bar.
		int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
		decorView.setSystemUiVisibility(uiOptions);

		activity = this;

		imageView.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				ActivitiesLauncher.launchMainActivity(activity);
			}
		});
	}

}
