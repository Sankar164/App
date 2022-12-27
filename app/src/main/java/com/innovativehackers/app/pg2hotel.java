package com.innovativehackers.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pg2hotel extends AppCompatActivity {
    private Button bck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg2hotel);
        final Button bck = findViewById(R.id.bck);
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pg2hotel.this,bookhotel.class);
                startActivity(intent);
            }
        });
    }
}