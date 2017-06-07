package com.example.mihai.imageeditor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

/**
 * Created by Mihai on 03/12/17.
 */

public class FiltersHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_popup);


        TabHost TabHost = (TabHost) findViewById(R.id.TabHost);
                TabHost.setup();
        TabHost.TabSpec tabSpec = TabHost.newTabSpec("Filters");
        tabSpec.setContent(R.id.filters);
        tabSpec.setIndicator("Filters");
        TabHost.addTab(tabSpec);


        TabHost = (android.widget.TabHost) findViewById(R.id.TabHost);
        TabHost.setup();
        TabHost.TabSpec tabSpec1 = TabHost.newTabSpec("Tools");
        tabSpec1.setContent(R.id.tools);
        tabSpec1.setIndicator("Tools");
        TabHost.addTab(tabSpec1);




}
    }
