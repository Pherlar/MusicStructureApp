package com.example.chrisl.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;


public class CategoryAActivity extends AppCompatActivity {

        public static ArrayList<Soundclip> soundclips;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.soundclip_list);

            // Create an ArrayList of words
            soundclips = new ArrayList<Soundclip>();


            soundclips.add(new Soundclip("Soundclip 1", "Artist 1","Description 1"));
            soundclips.add(new Soundclip("Soundclip 2", "Artist 2","Description 2"));
            soundclips.add(new Soundclip("Soundclip 3", "Artist 3","Description 3"));
            soundclips.add(new Soundclip("Soundclip 4", "Artist 4","Description 4"));
            soundclips.add(new Soundclip("Soundclip 5", "Artist 5","Description 5"));






            SoundclipAdapter adapter = new SoundclipAdapter(this, soundclips);

            ListView listView = findViewById(R.id.list);
            ImageButton ib = findViewById(R.id.playButton);


            listView.setAdapter(adapter);

        }
    }

