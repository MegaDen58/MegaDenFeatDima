package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.content.Intent;

import java.util.List;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        String[] arrayInfo = getResources().getStringArray(R.array.info);

        setContentView(R.layout.activity_main2);
        ListView list = findViewById(R.id.info);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayInfo);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if(position == 0){
                    Intent intent = new Intent(MainActivity2.this, earlyYears.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(MainActivity2.this, ThebeginningOfPopularity.class);
                    startActivity(intent);
                }

                if(position == 2){
                    Intent intent = new Intent(MainActivity2.this, thePeakOfPopularity.class);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(MainActivity2.this, changeOfComposition.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(MainActivity2.this, KnyazevRenegat.class);
                    startActivity(intent);
                }
                if(position == 5){
                    Intent intent = new Intent(MainActivity2.this, gorshenevIsDead.class);
                    startActivity(intent);
                }
            }
        });
    }
}