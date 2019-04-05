package com.example.anggarisky.majournal.Attractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anggarisky.majournal.Detailpicture.DetailAne1;
import com.example.anggarisky.majournal.Detailpicture.DetailAne2;
import com.example.anggarisky.majournal.Detailpicture.DetailAne3;
import com.example.anggarisky.majournal.Detailpicture.DetailAne4;
import com.example.anggarisky.majournal.Detailpicture.DetailAs1;
import com.example.anggarisky.majournal.Detailpicture.DetailAs2;
import com.example.anggarisky.majournal.Detailpicture.DetailAs3;
import com.example.anggarisky.majournal.Detailpicture.DetailAs4;
import com.example.anggarisky.majournal.R;

public class As extends AppCompatActivity {

    ImageView as1;
    ImageView as2;
    ImageView as3;
    ImageView as4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as);

        as1 = findViewById(R.id.as1);
        as2 = findViewById(R.id.as2);
        as3 = findViewById(R.id.as3);
        as4 = findViewById(R.id.as4);

        as1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(As.this, DetailAs1.class);
                startActivity(intent);
            }
        });
        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(As.this, DetailAs2.class);
                startActivity(intent);
            }
        });
        as3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(As.this, DetailAs3.class);
                startActivity(intent);
            }
        });
        as4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(As.this, DetailAs4.class);
                startActivity(intent);
            }
        });
    }
}
