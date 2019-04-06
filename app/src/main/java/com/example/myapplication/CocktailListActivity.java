package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CocktailListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;

    String[] cocktail = new String[] {
            "Pirates Blood",
            "Apple Gow",
            "Old Gow",
            "Hot Buttered Gow",
            "J. Gow New Amsterdam",
            "J. Gow Jungle Thyme",
            "J. Gow Orange Daiquiri",
            "Sunset Manhattan",
            "J. Gow Rum and Maple Flip"
    };

    String[] ingredients = new String[] {
            "50ml J. Gow Spiced Rum \n100ml Cranberry juice \nOrange peel \n2 dashes bitters",
            "50ml J. Gow Spiced Rum \n100ml Cloudy Apple juice \nMint Leaves \n2-3 lime wedges",
            "50ml J. Gow Spiced Rum \n1 teaspoon demerara sugar \nA splash of water or soda \n2-3 dashes bitters \nA twist of orange peel \nIce",
            "50ml J. Gow Spiced Rum \n2 tsp Demerara sugar \n2 tsp Unsalted butter \n2 dashes bitters \nA pinch of ground cinnamon  \nA pinch of Allspice \nCocoa powder",
            "50ml J. Gow Spiced Rum \n25ml Sweet red Vermouth \nOrange peel \n2 dashes bitters \nIce",
            "50ml J. Gow Spiced Rum \n20ml Campari \n20ml Lime Juice \n20ml Thyme Syrup \n50ml Pineapple Juice \nPineapple chunk and fronds \nIce",
            "50ml J. Gow Spiced Rum \n15ml Lime juice \n10ml Orange Juice \n1 tsp Curacao/Triple Sec \n1 tsp granulated sugar \nIce",
            "50ml J. Gow Fading Light \n25ml Dry Vermouth \n2 Dashes bitters \nTwist of Lemon \nCherry \nIce",
            "50ml J. Gow Spiced Rum \n15ml Oloroso Sherry \n15ml Maple Syrup \n3 Dashes Bitters \n1 Whole Egg \nAllspice \nCocoa Powder \nDark Chocolate \nIce"
    };

    String[] instructions = new String[] {
            "Add the rum and cranberry juice to a glass full of ice. Add 2 dashes of bitters, stir and serve with a twist of orange peel.",
            "Add the rum and apple juice, mint and lime to a glass full of ice, stir and serve.",
            "Muddle the sugar with the bitters until dissolved, add a splash of water or soda to make it easier. Add the rum, orange peel and ice. Stir and serve.",
            "Add all ingredients except the rum, to a pan. On a low heat, melt the sugar and butter into a syrup. Remove from the heat, add the rum, stir and strain into a heatproof glass. Dust with cocoa powder to garnish.",
            "Add the Ice, Rum, Vermouth and bitters to a cocktail shaker, stir thoroughly, strain into a cocktail glass. Serve with a twist of orange peel.",
            "Add all the liquid ingredients into a cocktail shaker full of ice. Shake well, pour into a tumbler with one large ice cube. Serve with a pineapple chunk and fronds for garnish.",
            "Dissolve the sugar with the lime juice in a cocktail shaker. Add the rest of the ingredients and ice. Shake well and strain into a cocktail glass. Garnish with orange and lime peel.",
            "Add the Ice, Rum, Vermouth and bitters to a cocktail shaker, stir thoroughly, strain into a cocktail glass. Serve with a twist of lemon and a maraschino cherry.",
            "Add the rum, sherry, maple syrup, bitters and egg to a cocktail shaker. Add the ice, shake vigorously for 30 seconds. Strain into a glass. Dust with allspice and cocoa powder, garnish with grated or flaked dark chocolate."
    };

    int [] image = new int[] {
            R.mipmap.ic_piratesblood_foreground,
            R.mipmap.ic_applegow_foreground,
            R.mipmap.ic_oldgow_foreground,
            R.mipmap.ic_hotbutteredgow_foreground,
            R.mipmap.ic_newamsterdam_foreground,
            R.mipmap.ic_junglethyme_foreground,
            R.mipmap.ic_oranged_foreground,
            R.mipmap.ic_sunset_foreground,
            R.mipmap.ic_mapleflip_foreground
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_list);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> cocktailAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, cocktail);

        listView.setAdapter(cocktailAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getBaseContext(),CocktailDetailActivity.class);
        intent.putExtra("name",cocktail[position]);
        intent.putExtra("ingredients",ingredients[position]);
        intent.putExtra("instructions",instructions[position]);
        intent.putExtra("image",image[position]);
        startActivity(intent);
    }
}
