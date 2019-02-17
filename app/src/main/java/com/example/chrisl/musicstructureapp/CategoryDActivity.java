package com.example.chrisl.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class CategoryDActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.soundclip_list);

            // Create an ArrayList of words
            ArrayList<Soundclip> soundclips = new ArrayList<Soundclip>();


            soundclips.add(new Soundclip("Soundclip D1", "Artist D1","Description 1"));
            soundclips.add(new Soundclip("Soundclip D2", "Artist D2","Description 2"));
            soundclips.add(new Soundclip("Soundclip D3", "Artist D3","Description 3"));
            soundclips.add(new Soundclip("Soundclip D4", "Artist D4","Description 4"));
            soundclips.add(new Soundclip("Soundclip D5", "Artist D5","Description 5"));





            SoundclipAdapter adapter = new SoundclipAdapter(this, soundclips);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        }
    }

