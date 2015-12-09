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

    boolean [] alternatefingeringbollbass = {false, false, false, false, true, false, false, false,
        false, false, false, false, false, false, true, false, false, true, true, false, false,
        true, true, true, false, true, true, true, true, true, true, true, true, true, true,
        true, true, true, true, true, true, true, true};

    boolean [][] alternatevalvesbass = {{false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, true},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, true},
            {false, false, false},
            {false, false, false},
            {true, true, true},
            {true, false, true},
            {false, false, false},
            {false, false, false},
            {false, false, true},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {false, false, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {false, false, true},
            {true, false, true},
            {true, false, true},
            {true, true, true},
            {true, false, true},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false}
    };

    public String[] getBassNotesNames(){ return this.bassnotenames; }

    public String getABassNoteName (int i){ return this.bassnotenames[i]; }

    public boolean getValve1Bass (int i){ return this.bassvalves[i][0]; }

    public boolean getValve2Bass (int i){ return this.bassvalves[i][1]; }

    public boolean getValve3Bass (int i){ return this.bassvalves[i][2]; }

    public String[] getNoteImageBass() { return this.bassnoteimages; }

    public boolean[] getAlternateFingeringBass() { return this.alternatefingeringbollbass; }

    public boolean getAlternateValve1Bass (int i) { return this.alternatevalvesbass[i][0]; }

    public boolean getAlternateValve2Bass (int i) { return this.alternatevalvesbass[i][1]; }

    public boolean getAlternateValve3Bass (int i) { return this.alternatevalvesbass[i][2]; }

    public int getCurrentNotePosition() { return this.currentnoteposition; }

    public void setCurrentNotePosition (int i) {currentnoteposition = i; }









    //Treble note code
    String [] treblenotenames = {"Low F#", "Low Gb", "Low G", "Low G#", "Low Ab",
            "Low A ", "Low A#", "Low Bb", "Low B", "Low C", "Low C#", "Low Db", "Low D",
            "Low D#", "Low Eb", "Low E", "F", "F#", "Gb", "G", "G#", "Ab", "A", "A#", "Bb",
            "B", "C", "C#", "Db", "D", "D#", "Eb", "E", "High F", "High F#", "High Gb",
            "High G", "High G#", "High Ab", "High A", "High A#", "High Bb", "High B", };

    boolean[][] treblevalves = new boolean[][]{
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {false, true, false},
            {false, true, false},
            {false, false, false},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false},
            {false, false, false},
            {true, true, false},
            {true, true, false},
            {true, false, false},
            {false, true, false},
            {false, true, false},
            {false, false, false},
            {true, false, false},
            {false, true, false},
            {false, true, false},
            {false, false, false},
            {false, true, true},
            {false, true, true},
            {true, true, false},
            {true, false, false},
            {true, false, false},
            {false, true, false}
    };

    String [] treblenoteimages = {"treble_low_f_sharp", "treble_low_g_flat", "treble_low_g",
            "treble_low_g_sharp", "treble_low_a_flat", "treble_low_a", "treble_low_a_sharp",
            "treble_low_b_flat", "treble_low_b", "treble_low_c", "treble_low_c_sharp",
            "treble_low_d_flat", "treble_low_d", "treble_low_d_sharp", "treble_low_e_flat",
            "treble_low_e", "treble_f", "treble_f_sharp", "treble_g_flat", "treble_g",
            "treble_g_sharp", "treble_a_flat", "treble_a", "treble_a_sharp", "treble_b_flat",
            "treble_b", "treble_c", "treble_c_sharp", "treble_d_flat", "treble_d",
            "treble_d_sharp", "treble_e_flat", "treble_e", "treble_high_f",
            "treble_high_f_sharp", "treble_high_g_flat", "treble_high_g", "treble_high_g_sharp",
            "treble_high_a_flat", "treble_high_a", "treble_high_a_sharp", "treble_high_b_flat",
            "treble_high_b", };

    boolean [] alternatefingeringbolltreble = {false, false, false, false, false, true, false,
            false, false, false, false, false, false, false, false, true, false, true, true,
            true, false, false, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true, true, true, true};

    boolean [][] alternatevalvestreble = {
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, true},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, true},
            {false, false, false},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, false, false},
            {false, false, false},
            {false, false, true},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, false, true},
            {false, false, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {false, false, true},
            {true, false, true},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {true, true, true},
            {true, true, true},
            {true, false, true},
            {false, true, true},
            {false, true, true},
            {true, true, false}
    };

    public String[] getTrebleNotesNames(){ return this.treblenotenames; }

    public String getATrebleNoteName (int i){ return this.treblenotenames[i]; }

    public boolean getValve1Treble (int i){ return this.treblevalves[i][0]; }

    public boolean getValve2Treble (int i){ return this.treblevalves[i][1]; }

    public boolean getValve3Treble (int i){ return this.treblevalves[i][2]; }

    public String[] getNoteImageTreble() { return this.treblenoteimages; }

    public boolean[] getAlternateFingeringTreble() { return this.alternatefingeringbolltreble; }

    public boolean getAlternateValve1Treble (int i) { return this.alternatevalvestreble[i][0]; }

    public boolean getAlternateValve2Treble (int i) { return this.alternatevalvestreble[i][1]; }

    public boolean getAlternateValve3Treble (int i) { return this.alternatevalvestreble[i][2]; }


}
