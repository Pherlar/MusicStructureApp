package com.example.chrisl.musicstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the AAA category
        TextView numbers = (TextView) findViewById(R.id.CategoryA);

        // Set a click listener on that View
        numbers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Category A Activity}
                Intent categoryAIntent = new Intent(MainActivity.this, CategoryAActivity.class);

                // Start the new activity
                startActivity(categoryAIntent);
            }
        });

        // Find the View that shows the BBB category
        TextView family = (TextView) findViewById(R.id.CategoryB);

        // Set a click listener on that View
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Category B activity
                Intent categoryBIntent = new Intent(MainActivity.this, CategoryBActivity.class);

                // Start the new activity
                startActivity(categoryBIntent);
            }
        });

        // Find the View that shows the CCC category
        TextView colors = (TextView) findViewById(R.id.CategoryC);

        // Set a click listener on that View
        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Category C activity
                Intent categoryCIntent = new Intent(MainActivity.this, CategoryCActivity.class);

                // Start the new activity
                startActivity(categoryCIntent);
            }
        });

        // Find the View that shows the DDD category
        TextView phrases = (TextView) findViewById(R.id.CategoryD);

        // Set a click listener on that View
        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Category D activity
                Intent categoryDIntent = new Intent(MainActivity.this, CategoryDActivity.class);

                // Start the new activity
                startActivity(categoryDIntent);
            }
        });
    }
}

