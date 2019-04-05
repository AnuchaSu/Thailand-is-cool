package com.example.anggarisky.majournal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConThemeAct extends AppCompatActivity {

    String getThemeku;
    String themeku = "";
    String SHARED_PREFS = "codeTheme";

    TextView subtitlepage;
    Button btncontinue;
    ImageView icontheme;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_theme);

        subtitlepage = findViewById(R.id.subtitlepage);
        btncontinue = findViewById(R.id.btncontinue);
        icontheme = findViewById(R.id.icontheme);

        changeOurTheme();

    }
    public void changeOurTheme(){

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        getThemeku = sharedPreferences.getString(themeku, "");

        if(getThemeku.equals("blue")) {
            icontheme.setImageResource(R.drawable.icmob);
            btncontinue.setBackgroundResource(R.drawable.bgblue);
            subtitlepage.setText("You choose blue color");
        }
        else if(getThemeku.equals("green")) {
            icontheme.setImageResource(R.drawable.icmog);
            btncontinue.setBackgroundResource(R.drawable.bggreen);
            subtitlepage.setText("You choose green color");
        }
        else if(getThemeku.equals("purple")) {
            icontheme.setImageResource(R.drawable.icmop);
            btncontinue.setBackgroundResource(R.drawable.bgpurple);
            subtitlepage.setText("You choose purple color");
        }
        else if(getThemeku.equals("orange")) {
            icontheme.setImageResource(R.drawable.icmoc);
            btncontinue.setBackgroundResource(R.drawable.bgorange);
            subtitlepage.setText("You choose orange color");
        }
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ConThemeAct.this, About.class);
                startActivity(a);
            }
        });

    }

}
