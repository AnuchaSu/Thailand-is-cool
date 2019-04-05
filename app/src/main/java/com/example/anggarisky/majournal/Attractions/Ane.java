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
import com.example.anggarisky.majournal.Detailpicture.DetailAne1;
import com.example.anggarisky.majournal.Detailpicture.DetailAne2;
import com.example.anggarisky.majournal.Detailpicture.DetailAne3;
import com.example.anggarisky.majournal.Detailpicture.DetailAne4;
import com.example.anggarisky.majournal.R;

public class Ane extends AppCompatActivity {

    ImageView ane1;
    ImageView ane2;
    ImageView ane3;
    ImageView ane4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ane);
        ane1 = findViewById(R.id.ane1);
        ane2 = findViewById(R.id.ane2);
        ane3 = findViewById(R.id.ane3);
        ane4 = findViewById(R.id.ane4);

        ane1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ane.this, DetailAne1.class);
                startActivity(intent);
            }
        });
        ane2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ane.this, DetailAne2.class);
                startActivity(intent);
            }
        });
        ane3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ane.this, DetailAne3.class);
                startActivity(intent);
            }
        });
        ane4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ane.this, DetailAne4.class);
                startActivity(intent);
            }
        });

    }
}
