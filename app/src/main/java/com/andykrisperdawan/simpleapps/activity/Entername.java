package com.andykrisperdawan.simpleapps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.andykrisperdawan.simpleapps.R;

public class Entername extends AppCompatActivity {

    private EditText edtName;
    private Button btnSubmit;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entername);
        setTitle("Enter Name");

        edtName = findViewById(R.id.edtxt_name);
        btnSubmit = findViewById(R.id.bt_name);
        txtOutput = findViewById(R.id.txt_resultname);
    }
    public void actionTampil(View view) {
        if (edtName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Not Yet!", Toast.LENGTH_SHORT).show();
        } else {
            txtOutput.setText(edtName.getText().toString());
        }
    }
}
