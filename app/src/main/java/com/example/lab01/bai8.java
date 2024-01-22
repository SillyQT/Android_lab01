package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bai8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai8);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn_ClearBai8 = findViewById(R.id.btn_ClearBai8);
        btn_ClearBai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt_F = findViewById(R.id.txt_Fahrenheit);
                EditText txt_C = findViewById(R.id.txt_Celsius);
                txt_F.setText("");
                txt_C.setText("");
            }
        });


        Button btn_ConToC = findViewById(R.id.btn_ConToC);
        btn_ConToC.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText txt_C = findViewById(R.id.txt_Celsius);
                EditText txt_F = findViewById(R.id.txt_Fahrenheit);

                if (txt_F.getText().toString().matches("")) {
                    Toast.makeText(bai8.this, "You did not enter a Fahrenheit",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                txt_C.setText(Double.toString((Double.parseDouble(txt_F.getText().toString()) - (double) 32) * 5 / 9));
            }
        });

        Button btn_ConToF = findViewById(R.id.btn_ConToF);
        btn_ConToF.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText txt_F = findViewById(R.id.txt_Fahrenheit);
                EditText txt_C = findViewById(R.id.txt_Celsius);

                if (txt_C.getText().toString().matches("")) {
                    Toast.makeText(bai8.this, "You did not enter a Celsius",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                txt_F.setText(Double.toString(Double.parseDouble(txt_C.getText().toString()) * 9 / 5 + 32));
            }
        });
    }
}