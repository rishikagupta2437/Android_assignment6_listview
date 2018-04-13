package com.example.rishika.listviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


     ListView list1;
    String []countries={"India","USA","Australia","France"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=(ListView) findViewById(R.id.listviews);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,countries);
        list1.setAdapter(arrayAdapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String cities = String.valueOf(list1.getItemAtPosition(i));

                if(i== 0)
                {
                    Intent intent=new Intent(MainActivity.this,cities.class);

                    intent.putExtra("position","0");
                    startActivity(intent);

                }

                if(i == 1)
                {
                    Intent intent=new Intent(MainActivity.this,cities.class);

                    intent.putExtra("position","1");
                    startActivity(intent);

                }
                if(i== 2)
                {
                    Intent intent=new Intent(MainActivity.this,cities.class);

                    intent.putExtra("position","2");
                    startActivity(intent);

                }

                if(i == 3)
                {
                    Intent intent=new Intent(MainActivity.this,cities.class);

                    intent.putExtra("position","3");
                    startActivity(intent);
                }


            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
