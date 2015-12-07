package com.example.trevorsites.baritonefingerchart;

import android.app.Application;

/**
 * Created by trevor.sites on 12/3/2015.
 */
public class Globals extends Application {

    int currentnoteposition = 0;

    String [] bassnotenames = {"Low E","Low F","Low F#","Low Gb","Low G","Low G#","Low Ab","Low A",
            "Low A#","Low Bb","Low B","C","C#","Db","D","D#","Eb","E","F","F#","Gb","G","G#","Ab",
            "A","A#","Bb","B","High C","High C#","High Db","High D","High D#","High Eb","High E",
            "High F","High F#","High Gb","High G","High G#","High Ab","High A","High Bb"};

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

    String [] bassnoteimages = {"bass_low_e","bass_low_f","bass_low_f_sharp","bass_low_g_flat",
        "bass_low_g","bass_low_g_sharp","bass_low_a_flat","bass_low_a", "bass_low_a_sharp",
        "bass_low_b_flat","bass_low_b","bass_c","bass_c_sharp","bass_d_flat","bass_d",
        "bass_d_sharp","bass_e_flat","bass_e","bass_f","bass_f_sharp","bass_g_flat",
        "bass_g","bass_g_sharp","bass_a_flat","bass_a","bass_a_sharp","bass_b_flat",
        "bass_b","bass_high_c","bass_high_c_sharp","bass_high_d_flat","bass_high_d",
        "bass_high_d_sharp","bass_high_e_flat","bass_high_e","bass_high_f",
        "bass_high_f_sharp","bass_high_g_flat","bass_high_g","bass_high_g_sharp",
        "bass_high_a_flat","bass_high_a","bass_high_b_flat"};


}
