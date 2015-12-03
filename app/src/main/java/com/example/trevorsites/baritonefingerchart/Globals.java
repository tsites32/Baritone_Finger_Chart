package com.example.trevorsites.baritonefingerchart;

import android.app.Application;

/**
 * Created by trevor.sites on 12/3/2015.
 */
public class Globals extends Application {

    int currentnoteposition = 0;

    String [] bassnotenames = {"Low E","Low F","Low F#","Low Gb","Low G","Low G#","Low Ab","Low A","Low A#","Low Bb","Low B","C","C#","Db","D","D#","Eb","E","F","F#","Gb","G","G#","Ab","A","A#","Bb","B","High C","High C#","High Db","High D","High D#","High Eb","High E","High F","High F#","High Gb","High G","High G#","High Ab","High A","High Bb"};

    boolean[][] bassvalves = new boolean[][]{
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false},
            {false, false, false},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false},
            {false, false, false},
            {true, true, false},
            {true, false, false},
            {false, true, false},
            {false, true, false},
            {false, false, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false}
    };

    String [] bassnoteimages = {};
}
