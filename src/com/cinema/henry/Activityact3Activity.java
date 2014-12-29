package com.cinema.henry;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Activityact3Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activityact3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activityact3, menu);
		return true;
	}

}
