package com.example.anggarisky.majournal.Food;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anggarisky.majournal.About;
import com.example.anggarisky.majournal.R;

public class Menufood extends AppCompatActivity {



        String getThemeku;
        String themeku = "";
        String SHARED_PREFS = "codeTheme";


        Button btnfn;
        Button btnfs;
        Button btnfne;
        Button btnfc;
        Button btnspecial;
        Button btnback;


        private Bundle savedInstanceState;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menufood);

            btnfn = (Button)findViewById(R.id.btnfn);
            btnfc = (Button) findViewById(R.id.btnfc);
            btnfne = (Button) findViewById(R.id.btnfne);
            btnfs = (Button) findViewById(R.id.btnfs);
            btnspecial = (Button) findViewById(R.id.btnspicial);
            btnback = (Button) findViewById(R.id.btnback);
            changeOurTheme();
        }
        public void changeOurTheme(){

            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            getThemeku = sharedPreferences.getString(themeku, "");

            if(getThemeku.equals("blue")) {

                btnfn.setBackgroundResource(R.drawable.bgblue);
                btnfc.setBackgroundResource(R.drawable.bgblue);
                btnfne.setBackgroundResource(R.drawable.bgblue);
                btnfs.setBackgroundResource(R.drawable.bgblue);
                btnspecial.setBackgroundResource(R.drawable.bgblue);
                btnback.setBackgroundResource(R.drawable.bgblue);

            }
            else if(getThemeku.equals("green")) {

                btnfn.setBackgroundResource(R.drawable.bggreen);
                btnfc.setBackgroundResource(R.drawable.bggreen);
                btnfne.setBackgroundResource(R.drawable.bggreen);
                btnfs.setBackgroundResource(R.drawable.bggreen);
                btnspecial.setBackgroundResource(R.drawable.bggreen);
                btnback.setBackgroundResource(R.drawable.bggreen);



            }
            else if(getThemeku.equals("purple")) {

                btnfn.setBackgroundResource(R.drawable.bgpurple);
                btnfc.setBackgroundResource(R.drawable.bgpurple);
                btnfne.setBackgroundResource(R.drawable.bgpurple);
                btnfs.setBackgroundResource(R.drawable.bgpurple);
                btnspecial.setBackgroundResource(R.drawable.bgpurple);
                btnback.setBackgroundResource(R.drawable.bgpurple);

            }
            else if(getThemeku.equals("orange")) {

                btnfn.setBackgroundResource(R.drawable.bgorange);
                btnfc.setBackgroundResource(R.drawable.bgorange);
                btnfne.setBackgroundResource(R.drawable.bgorange);
                btnfs.setBackgroundResource(R.drawable.bgorange);
                btnspecial.setBackgroundResource(R.drawable.bgorange);
                btnback.setBackgroundResource(R.drawable.bgorange);


            }
            btnfc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(Menufood.this, fc.class);
                    startActivity(a);
                }
            });
            btnback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(Menufood.this, About.class);
                    startActivity(a);
                }
            });
            btnfne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(Menufood.this, fne.class);
                    startActivity(a);
                }
            });
            btnfn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(Menufood.this, fn.class);
                    startActivity(a);
                }
            });
            btnfs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(Menufood.this, fs.class);
                    startActivity(a);
                }
            });
            btnspecial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(Menufood.this, fspacia.class);
                    startActivity(a);
                }
            });


        }
    }
