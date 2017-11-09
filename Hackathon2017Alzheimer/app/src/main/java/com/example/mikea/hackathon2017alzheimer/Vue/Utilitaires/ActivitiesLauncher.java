package com.example.mikea.hackathon2017alzheimer.Vue.Utilitaires;

import android.app.Activity;
import android.content.Intent;

import com.example.mikea.hackathon2017alzheimer.Vue.Activites.FindThePersonActivity;

/**
 * Created by Mike AUBENAS on 09/11/2017.
 */

public class ActivitiesLauncher
{
	public static void launchFindThePersonActivity(Activity activity)
	{
		Intent intent = new Intent(activity, FindThePersonActivity.class);
		activity.startActivity(intent);
	}
}
