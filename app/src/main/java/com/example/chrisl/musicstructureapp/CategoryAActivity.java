package com.example.chrisl.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class CategoryAActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.soundclip_list);

            // Create an ArrayList of words
            ArrayList<Soundclip> soundclips = new ArrayList<Soundclip>();


            soundclips.add(new Soundclip("Soundclip A1", "Artist A1","Description 1"));
            soundclips.add(new Soundclip("Soundclip A2", "Artist A2","Description 2"));
            soundclips.add(new Soundclip("Soundclip A3", "Artist A3","Description 3"));
            soundclips.add(new Soundclip("Soundclip A4", "Artist A4","Description 4"));
            soundclips.add(new Soundclip("Soundclip A5", "Artist A5","Description 5"));






            SoundclipAdapter adapter = new SoundclipAdapter(this, soundclips);

            ListView listView = findViewById(R.id.list);
            //set colour to adapter
            //listView.setBackgroundResource(R.color.category_family);
            listView.setAdapter(adapter);



        }

            //TODO Create onButtonClick function which creates an intent to
            //TODO open the selected clip in the now Playing Activity





    }

