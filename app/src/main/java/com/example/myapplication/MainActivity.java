package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    ImageButton clown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clown = findViewById(R.id.clown);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        clown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(intent);
            }
        });
    }
}