package com.example.chrisl.musicstructureapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SoundclipAdapter extends ArrayAdapter<Soundclip> {

    //private String sound_category;

    public SoundclipAdapter(Activity context, ArrayList<Soundclip> soundclips) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, soundclips);
    }
    
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        final Soundclip currentSoundclip = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_tv);
        nameTextView.setText(currentSoundclip.getSoundclipName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_tv);
        artistTextView.setText(currentSoundclip.getSoundclipArtist());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.description_tv);
        descTextView.setText(currentSoundclip.getSoundclipInfo());

        //add play button text view to adapter
        ImageButton playButton = listItemView.findViewById(R.id.playButton);

        //set an onclick listener to each play button as it is created
        playButton.setOnClickListener(new View.OnClickListener()
        {
            // run this once clicked
            @Override
            public void onClick(View v)
            {
                Context sound_category = getContext();
                Intent intent = new Intent(sound_category, NowPlayingActivity.class);
                //pass in the clicked song value with the intent
                intent.putExtra("Current Soundclip",currentSoundclip);
                sound_category.startActivity(intent);
            }

        });

        // Return the whole list item layout (containing multiple TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}