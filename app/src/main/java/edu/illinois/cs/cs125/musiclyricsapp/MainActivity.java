package edu.illinois.cs.cs125.musiclyricsapp;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(Tag, "App Has Started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
