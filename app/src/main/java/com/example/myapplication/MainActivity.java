package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutButton;
    Button cocktailButton;
    Button websiteButton;
    Button emailButton;
    Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutButton = (Button) findViewById(R.id.aboutButton);
        cocktailButton = (Button) findViewById(R.id.cocktailButton);
        websiteButton = (Button) findViewById(R.id.websiteButton);
        emailButton = (Button) findViewById(R.id.emailButton);
        callButton = (Button) findViewById(R.id.callButton);

        //About Button
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });

        //Cocktail List Button
        cocktailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(), CocktailListActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });

        //Website Button
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri jgWeburl = Uri.parse("https://jgowrum.com/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, jgWeburl);
                startActivity(launchBrowser);
            }
        });

        //Call Button
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri jgPhoneNumber = Uri.parse("tel:01856781714");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, jgPhoneNumber);
                startActivity(callIntent);
            }
        });

        //Email Button
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"info@vsdistillersltd.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "J.Gow Rum Query");
                startActivity(emailIntent);
            }
        });
    }
}
