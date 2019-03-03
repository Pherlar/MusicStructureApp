package com.example.chrisl.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class CategoryBActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.soundclip_list);

            // Create an ArrayList of soundclips
            ArrayList<Soundclip> soundclips = new ArrayList<Soundclip>();

            soundclips.add(new Soundclip("Soundclip B1", "Artist B1","Description 1"));
            soundclips.add(new Soundclip("Soundclip B2", "Artist B2","Description 2"));
            soundclips.add(new Soundclip("Soundclip B3", "Artist B3","Description 3"));
            soundclips.add(new Soundclip("Soundclip B4", "Artist B4","Description 4"));
            soundclips.add(new Soundclip("Soundclip B5", "Artist B5","Description 5"));

            SoundclipAdapter adapter = new SoundclipAdapter(this, soundclips);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        }
    }

