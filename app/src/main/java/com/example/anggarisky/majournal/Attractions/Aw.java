package com.example.anggarisky.majournal.Attractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anggarisky.majournal.Detailpicture.DetailAs1;
import com.example.anggarisky.majournal.Detailpicture.DetailAs2;
import com.example.anggarisky.majournal.Detailpicture.DetailAs3;
import com.example.anggarisky.majournal.Detailpicture.DetailAs4;
import com.example.anggarisky.majournal.Detailpicture.DetailAw1;
import com.example.anggarisky.majournal.Detailpicture.DetailAw2;
import com.example.anggarisky.majournal.Detailpicture.DetailAw3;
import com.example.anggarisky.majournal.Detailpicture.DetailAw4;
import com.example.anggarisky.majournal.R;

public class Aw extends AppCompatActivity {

    ImageView aw1;
    ImageView aw2;
    ImageView aw3;
    ImageView aw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aw);

        aw1 = findViewById(R.id.aw1);
        aw2 = findViewById(R.id.aw2);
        aw3 = findViewById(R.id.aw3);
        aw4 = findViewById(R.id.aw4);

        aw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aw.this, DetailAw1.class);
                startActivity(intent);
            }
        });
        aw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aw.this, DetailAw2.class);
                startActivity(intent);
            }
        });
        aw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aw.this, DetailAw3.class);
                startActivity(intent);
            }
        });
        aw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aw.this, DetailAw4.class);
                startActivity(intent);
            }
        });
    }
}
