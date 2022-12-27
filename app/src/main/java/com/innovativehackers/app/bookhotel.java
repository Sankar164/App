package com.innovativehackers.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bookhotel extends AppCompatActivity {
    private Button nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookhotel);
        final Button nxt = findViewById(R.id.nxt);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bookhotel.this,pg2hotel.class);
                startActivity(intent);
            }
        });
    }
}