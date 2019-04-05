package com.example.anggarisky.majournal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anggarisky.majournal.Attractions.MenuAttractions;
import com.example.anggarisky.majournal.Culture.Culture;
import com.example.anggarisky.majournal.Food.Menufood;

public class About extends AppCompatActivity {

    String getThemeku;
    String themeku = "";
    String SHARED_PREFS = "codeTheme";


    Button btnculture;
    Button btnfood;
    Button btnlong;
    Button btnbeautiful;
    Button btnback;
    Button applyButton;

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        btnculture = (Button)findViewById(R.id.btnculture);
        btnfood = (Button) findViewById(R.id.btnfood);
        btnbeautiful = (Button) findViewById(R.id.btnbeautiful);
        btnlong = (Button) findViewById(R.id.btnlong);
        btnback = (Button) findViewById(R.id.btnback);



        changeOurTheme();

    }
    public void changeOurTheme(){

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        getThemeku = sharedPreferences.getString(themeku, "");

        if(getThemeku.equals("blue")) {

            btnculture.setBackgroundResource(R.drawable.bgblue);
            btnfood.setBackgroundResource(R.drawable.bgblue);
            btnbeautiful.setBackgroundResource(R.drawable.bgblue);
            btnlong.setBackgroundResource(R.drawable.bgblue);
            btnback.setBackgroundResource(R.drawable.bgblue);

        }
        else if(getThemeku.equals("green")) {

            btnculture.setBackgroundResource(R.drawable.bggreen);
            btnfood.setBackgroundResource(R.drawable.bggreen);
            btnlong.setBackgroundResource(R.drawable.bggreen);
            btnbeautiful.setBackgroundResource(R.drawable.bggreen);
            btnback.setBackgroundResource(R.drawable.bggreen);



        }
        else if(getThemeku.equals("purple")) {

            btnculture.setBackgroundResource(R.drawable.bgpurple);
            btnlong.setBackgroundResource(R.drawable.bgpurple);
            btnbeautiful.setBackgroundResource(R.drawable.bgpurple);
            btnfood.setBackgroundResource(R.drawable.bgpurple);
            btnback.setBackgroundResource(R.drawable.bgpurple);

        }
        else if(getThemeku.equals("orange")) {

            btnculture.setBackgroundResource(R.drawable.bgorange);
            btnfood.setBackgroundResource(R.drawable.bgorange);
            btnbeautiful.setBackgroundResource(R.drawable.bgorange);
            btnlong.setBackgroundResource(R.drawable.bgorange);
            btnback.setBackgroundResource(R.drawable.bgorange);


        }
        btnculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(About.this, Culture.class);
                startActivity(a);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(About.this, MainActivity.class);
                startActivity(a);
            }
        });
        btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(About.this, Menufood.class);
                startActivity(a);
            }
        });
        btnlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(About.this, Bnfy.class);
                startActivity(a);
            }
        });
        btnbeautiful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(About.this, MenuAttractions.class);
                startActivity(a);
            }
        });

    }
}