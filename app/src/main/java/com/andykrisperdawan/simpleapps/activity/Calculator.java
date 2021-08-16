package com.andykrisperdawan.simpleapps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.andykrisperdawan.simpleapps.R;

public class Calculator extends AppCompatActivity {

    private EditText edtNumber1, edtNumber2;
    private Button btPlus, btMinus, btMultiply, btDivided;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        edtNumber1 = findViewById(R.id.edtxt_number1);
        edtNumber2 = findViewById(R.id.edtxt_number2);
        txtResult = findViewById(R.id.txt_resultcalculator);

        setTitle("Calculator");
    }
    public void actionPlus(View view) {
        double angka1 = Double.parseDouble(edtNumber1.getText().toString());
        double angka2 = Double.parseDouble( edtNumber2.getText().toString());
        double hasil = angka1 + angka2;
        txtResult.setText(String.valueOf(hasil));
    }

    public void actionMinus(View view) {
        double angka1 = Double.parseDouble(edtNumber1.getText().toString());
        double angka2 = Double.parseDouble( edtNumber2.getText().toString());
        double hasil = angka1 - angka2;
        txtResult.setText(String.valueOf(hasil));
    }

    public void actionDivided(View view) {
        double angka1 = Double.parseDouble(edtNumber1.getText().toString());
        double angka2 = Double.parseDouble( edtNumber2.getText().toString());
        double hasil = angka1 / angka2;
        txtResult.setText(String.valueOf(hasil));
    }

    public void actionMultiply(View view) {
        double angka1 = Double.parseDouble(edtNumber1.getText().toString());
        double angka2 = Double.parseDouble( edtNumber2.getText().toString());
        double hasil = angka1 * angka2;
        txtResult.setText(String.valueOf(hasil));
    }

    public void actionReset(View view) {
        edtNumber1.setText("");
        edtNumber2.setText("");
        txtResult.setText("0.0");
    }
}
