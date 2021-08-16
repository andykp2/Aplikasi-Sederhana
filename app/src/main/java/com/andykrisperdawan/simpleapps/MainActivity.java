package com.andykrisperdawan.simpleapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.andykrisperdawan.simpleapps.activity.Calculator;
import com.andykrisperdawan.simpleapps.activity.Entername;
import com.andykrisperdawan.simpleapps.activity.Listnation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgEnterName, imgCalculator, imgListNation;
    Entername entername = new Entername();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgEnterName = findViewById(R.id.img_entername);
        imgCalculator = findViewById(R.id.img_calculator);
        imgListNation = findViewById(R.id.img_listnation);

        imgEnterName.setOnClickListener(this);
        imgCalculator.setOnClickListener(this);
        imgListNation.setOnClickListener(this);

        setTitle("Home");
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.img_entername:
                Intent i = new Intent(this, Entername.class);
                startActivity(i);
                break;
            case R.id.img_calculator:
                startActivity(new Intent(this, Calculator.class));
                break;
            case R.id.img_listnation:
                startActivity(new Intent(this, Listnation.class));
                break;
        }
    }
}