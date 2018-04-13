package com.example.rishika.listviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cities extends AppCompatActivity {
    String India[] = {"Shahdol", "Mumbai", "Kolkata", "delhi"};
    String USA[] = {"Newyork","Austin", "Boston", "Washington"};
    String Australia[] = {"Sydney", "Broken hill", "Albury","Dubbo"};
    String France[] = {"Paris", "Lyon", "Rouen","Cannes"};

    ListView list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cities);


        list2 = (ListView) findViewById(R.id.listviews);
        String position = (getIntent().getStringExtra("position"));

        switch (position) {

            case "0": {
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, India);
                list2.setAdapter(arrayAdapter);
                break;
            }


            case "1": {
                ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, USA);
                list2.setAdapter(arrayAdapter1);
                break;

            }
            case "2": {
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, Australia);
                list2.setAdapter(arrayAdapter);
                break;

            }
            case "3": {
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, France);
                list2.setAdapter(arrayAdapter);
                break;


            }


        }
    }
}
