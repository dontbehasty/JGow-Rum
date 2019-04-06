package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CocktailDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView ingredientsTextView;
    TextView instructionsTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_detail);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ingredientsTextView = (TextView) findViewById(R.id.ingredientsTextView);
        instructionsTextView = (TextView) findViewById(R.id.instructionsTextView);
        imageView = (ImageView) findViewById(R.id.imageView);

        //Cocktail Name
        String cocktailName = (String) getIntent().getExtras().get("name");
        nameTextView.setText(cocktailName);

        String cocktailIngredient = (String) getIntent().getExtras().get("ingredients");
        ingredientsTextView.setText(cocktailIngredient);

        String cocktailInstructions = (String) getIntent().getExtras().get("instructions");
        instructionsTextView.setText(cocktailInstructions);

        int cocktailImage = (int) getIntent().getExtras().get("image");
        imageView.setImageResource(cocktailImage);
    }
}
