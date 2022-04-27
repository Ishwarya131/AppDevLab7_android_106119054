package com.example.lab7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class RestaurantActivity extends AppCompatActivity {

    Spinner typeofmenu, desserts, drinks, starters, maindish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        getSupportActionBar().setTitle("Restaurant");

        String[] typeofmenu1 = new String[]{"Veg","Non-veg"};
        String[] desserts1 = new String[]{"Icecream","Milkshake"};
        String[] drinks1 = new String[]{"Juice","Mojito"};
        String[] starters1 = new String[]{"BBQ","Kabab"};
        String[] maindish1 = new String[]{"Naan","Noodles","Rice"};


        typeofmenu = (Spinner)findViewById(R.id.typeofmenu);
        desserts = (Spinner)findViewById(R.id.desserts);
        drinks = (Spinner)findViewById(R.id.drinks);
        starters = (Spinner)findViewById(R.id.starters);
        maindish = (Spinner)findViewById(R.id.maindish);

        typeofmenu.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, typeofmenu1));
        drinks.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, drinks1));
        desserts.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, desserts1));
        starters.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, starters1));
        maindish.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, maindish1));
    }

    public void send(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("You've selected:");
        builder.setMessage("Type of menu: "+typeofmenu.getSelectedItem().toString()+"\n"
        +"Drinks: "+drinks.getSelectedItem().toString()+"\n"
        +"Starters: "+starters.getSelectedItem().toString()+"\n"
        +"Main dish: "+maindish.getSelectedItem().toString()+"\n"
        +"Desserts: "+desserts.getSelectedItem().toString());

        AlertDialog alert11 = builder.create();
        alert11.show();
    }
}