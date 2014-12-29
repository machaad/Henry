package com.cinema.henry;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Activityact1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activityact1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activityact1, menu);
		return true;
	}

}
