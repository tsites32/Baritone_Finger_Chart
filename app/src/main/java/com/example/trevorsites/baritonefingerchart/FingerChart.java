package com.example.trevorsites.baritonefingerchart;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by trevor.sites on 11/5/2015.
 */
public class FingerChart extends Activity {

    Globals g;

    int current_position;
    int toggle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fingerchart);

        g = (Globals) getApplication();

        current_position = 0;
        toggle = 0;

        final ImageView valveone = (ImageView) findViewById(R. id. valveone);

        final ImageView valvetwo = (ImageView) findViewById(R. id. valvetwo);

        final ImageView valvethree = (ImageView) findViewById(R. id. valvethree);

        final TextView notename = (TextView) findViewById(R. id. notename);

        final ImageView noteimage = (ImageView) findViewById((R. id. noteimage));

        final Spinner changenote = (Spinner) findViewById(R. id. changenote);

        final String[] noteimages = g.getNoteImageBass();

    }
}
