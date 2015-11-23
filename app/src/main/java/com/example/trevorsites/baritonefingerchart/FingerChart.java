package com.example.trevorsites.baritonefingerchart;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;

/**
 * Created by trevor.sites on 11/5/2015.
 */
public class FingerChart extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fingerchart);

        Button changenotebass =(Button) findViewById(R. id.btnchangenotebass);
        changenotebass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(FingerChart.this, ChangeNoteBass.class));
            }
        });
    }
}
