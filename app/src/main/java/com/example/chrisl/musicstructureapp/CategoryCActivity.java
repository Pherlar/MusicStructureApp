package com.example.chrisl.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class CategoryCActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.soundclip_list);

            // Create an ArrayList of words
            ArrayList<Soundclip> soundclips = new ArrayList<Soundclip>();


            soundclips.add(new Soundclip("Soundclip C1", "Artist C1","Description 1"));
            soundclips.add(new Soundclip("Soundclip C2", "Artist C2","Description 2"));
            soundclips.add(new Soundclip("Soundclip C3", "Artist C3","Description 3"));
            soundclips.add(new Soundclip("Soundclip C4", "Artist C4","Description 4"));
            soundclips.add(new Soundclip("Soundclip C5", "Artist C5","Description 5"));






            SoundclipAdapter adapter = new SoundclipAdapter(this, soundclips);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        }
    }
