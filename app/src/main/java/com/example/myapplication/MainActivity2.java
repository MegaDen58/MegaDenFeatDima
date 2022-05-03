package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import java.util.List;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        int a;
        super.onCreate(savedInstanceState);
        String[] arrayInfo = getResources().getStringArray(R.array.info);

        setContentView(R.layout.activity_main2);
        ListView list = findViewById(R.id.info);
        Intent intent = new Intent(this, third.class);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.mytextview, arrayInfo);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                intent.putExtra("key", ((TextView)v).getText() + ".html");
                startActivity(intent);
            }
        });
    }
}