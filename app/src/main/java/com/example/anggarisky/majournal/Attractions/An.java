package com.example.anggarisky.majournal.Attractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anggarisky.majournal.Detailpicture.DetailAn1;
import com.example.anggarisky.majournal.Detailpicture.DetailAn2;
import com.example.anggarisky.majournal.Detailpicture.DetailAn3;
import com.example.anggarisky.majournal.Detailpicture.DetailAn4;
import com.example.anggarisky.majournal.R;

public class An extends AppCompatActivity {

    ImageView an1;
    ImageView an2;
    ImageView an3;
    ImageView an4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an);

        an1 = findViewById(R.id.an1);
        an2 = findViewById(R.id.an2);
        an3 = findViewById(R.id.an3);
        an4 = findViewById(R.id.an4);

        an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(An.this, DetailAn1.class);
                startActivity(intent);
            }
        });
        an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(An.this, DetailAn2.class);
                startActivity(intent);
            }
        });
        an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(An.this, DetailAn3.class);
                startActivity(intent);
            }
        });
        an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(An.this, DetailAn4.class);
                startActivity(intent);
            }
        });
    }
}
