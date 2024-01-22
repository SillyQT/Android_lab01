package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class bai7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);

        Button btn_Binary = findViewById(R.id.btn_Binary);
        btn_Binary.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView kq = findViewById(R.id.kq_Bai7);

                EditText Deciaml_num = findViewById(R.id.txt_soDecimal);
                if (Deciaml_num.getText().toString().matches("")) {
                    Toast.makeText( bai7.this , "You did not enter a Decimal Number",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                kq.setText("Result: " + Integer.toBinaryString(Integer.parseInt(Deciaml_num.getText().toString())));
            }
        });

        Button btn_Hexa = findViewById(R.id.btn_Hexa);
        btn_Hexa.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView kq = findViewById(R.id.kq_Bai7);

                EditText Deciaml_num = findViewById(R.id.txt_soDecimal);
                if (Deciaml_num.getText().toString().matches("")) {
                    Toast.makeText( bai7.this , "You did not enter a Decimal Number",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                kq.setText("Result: " + Integer.toHexString(Integer.parseInt(Deciaml_num.getText().toString())));
            }
        });
    }

}