
package com.cinema.henry;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	TabHost th;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        th=(TabHost)findViewById(android.R.id.tabhost);
        
        TabSpec Act1 = th.newTabSpec("act1");
        Act1.setContent(new Intent(this,Activityact2Activity.class) );
        Act1.setIndicator("Carteleras");
        th.addTab(Act1);
        

        TabSpec Act2 = th.newTabSpec("act2");
        Act2.setContent(new Intent(this,Activityact3Activity.class) );
        Act2.setIndicator("Estrenos");
        th.addTab(Act2);

        TabSpec Act3 = th.newTabSpec("act3");
        Act3.setContent(new Intent(this,Activityact1Activity.class) );
        Act3.setIndicator("Proximos estrenos");
        th.addTab(Act3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
