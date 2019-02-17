package com.example.chrisl.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        //get intent
        Intent intent = getIntent();
        Soundclip soundclip = (Soundclip)intent.getSerializableExtra("Current Soundclip");
        Toast.makeText(this,"Current Song is " + soundclip.getSoundclipArtist() + soundclip.getSoundclipName(),Toast.LENGTH_LONG).show();
        //Assign Text Views to Variables
        TextView songNameTV = findViewById(R.id.soundclipNameTV);
        TextView artistTV = findViewById(R.id.nowPlayingArtistTV);
        TextView descriptionTV = findViewById(R.id.descriptionTV);

        songNameTV.setText(soundclip.getSoundclipName());
        artistTV.setText(soundclip.getSoundclipArtist());
        descriptionTV.setText(soundclip.getSoundclipInfo());

    }
}

