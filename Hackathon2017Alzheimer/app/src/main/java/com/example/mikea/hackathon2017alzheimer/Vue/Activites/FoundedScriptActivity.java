package com.example.mikea.hackathon2017alzheimer.Vue.Activites;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.mikea.hackathon2017alzheimer.R;

/**
 * Created by Mike AUBENAS on 09/11/2017.
 */

public class FoundedScriptActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.founded_script_activity);

		TextView texte = findViewById(R.id.leTexte);
		texte.setText(Html.fromHtml(getString(R.string.the_found_script)));

	}
}
