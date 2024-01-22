package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn_giaiPTB1 =
                findViewById(R.id.btn_giaiPTB1);

        btn_giaiPTB1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView qk = findViewById(R.id.kq_bai5);
                EditText so_a = findViewById(R.id.so_a_bai5);
                EditText so_b = findViewById(R.id.so_b_bai5);
                qk.setText(Double.toString(giaiPTB1(Double.parseDouble(so_a.getText().toString()),
                        Double.parseDouble(so_b.getText().toString()))));
            }
        });
    }
    public double giaiPTB1(Double a, Double b){
        return (0 - b)/a;
    }
}