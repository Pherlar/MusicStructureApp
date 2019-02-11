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

            // Create an ArrayList of words
            ArrayList<Soundclip> soundclips = new ArrayList<Soundclip>();


            soundclips.add(new Soundclip("Soundclip 1", "Artist 1","Description 1"));
            soundclips.add(new Soundclip("Soundclip 2", "Artist 2","Description 2"));
            soundclips.add(new Soundclip("Soundclip 3", "Artist 3","Description 3"));
            soundclips.add(new Soundclip("Soundclip 4", "Artist 4","Description 4"));
            soundclips.add(new Soundclip("Soundclip 5", "Artist 5","Description 5"));






            SoundclipAdapter adapter = new SoundclipAdapter(this, soundclips);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        }
    }

