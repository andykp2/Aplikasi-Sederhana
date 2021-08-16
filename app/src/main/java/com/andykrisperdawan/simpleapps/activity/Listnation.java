package com.andykrisperdawan.simpleapps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.andykrisperdawan.simpleapps.R;

public class Listnation extends AppCompatActivity {

    private ListView listNation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listnation);
        setTitle("List Nation");


        String [] countryArray = new String[]{
                "Indonesia", "Malaysia", "Brunei", "Thailand", "Jepang",
                "Jerman", "Inggris", "Austria", "Amerika", "Irak", "India", "Timor Leste",
                "Hongkong", "Spanyol", "Tiongkok", "Polandia", "Australia"
        };

        listNation = findViewById(R.id.lv_nation);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                countryArray);
        listNation.setAdapter(adapter);
        listNation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), countryArray[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}