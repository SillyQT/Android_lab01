package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bai9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai9);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView kq = findViewById(R.id.kq_Bai9);


        Button Tong = findViewById(R.id.btn_Tong_Bai9);
        Tong.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                @SuppressLint("CutPasteId") EditText a = findViewById(R.id.txt_so_a_bai9);
                @SuppressLint("CutPasteId") EditText b = findViewById(R.id.txt_so_b_bai9);

                if (a.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"a\"", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"b\"", Toast.LENGTH_SHORT).show();
                    return;
                }

                kq.setText("a + b = " + (Double.parseDouble(a.getText().toString()) + Double.parseDouble(b.getText().toString())));
            }
        });

        Button Hieu = findViewById(R.id.btn_Hieu_Bai9);
        Hieu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                @SuppressLint("CutPasteId") EditText a = findViewById(R.id.txt_so_a_bai9);
                @SuppressLint("CutPasteId") EditText b = findViewById(R.id.txt_so_b_bai9);

                if (a.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"a\"", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"b\"", Toast.LENGTH_SHORT).show();
                    return;
                }

                kq.setText("a - b = " + (Double.parseDouble(a.getText().toString()) - Double.parseDouble(b.getText().toString())));
            }
        });

        Button Tich = findViewById(R.id.btn_Tich_Bai9);
        Tich.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                @SuppressLint("CutPasteId") EditText a = findViewById(R.id.txt_so_a_bai9);
                @SuppressLint("CutPasteId") EditText b = findViewById(R.id.txt_so_b_bai9);

                if (a.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"a\"", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"b\"", Toast.LENGTH_SHORT).show();
                    return;
                }

                kq.setText("a * b = " + (Double.parseDouble(a.getText().toString()) * Double.parseDouble(b.getText().toString())));
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button Thuong = findViewById(R.id.btn_Thuong_Bai9);
        Thuong.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                @SuppressLint("CutPasteId") EditText a = findViewById(R.id.txt_so_a_bai9);
                @SuppressLint("CutPasteId") EditText b = findViewById(R.id.txt_so_b_bai9);

                if (a.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"a\"", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"b\"", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (b.getText().toString().matches("0")) {
                    Toast.makeText(bai9.this, "b cannot be 0",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                kq.setText("a / b = " + (Double.parseDouble(a.getText().toString()) / Double.parseDouble(b.getText().toString())));
            }
        });

        Button UCLN = findViewById(R.id.btn_UCLN_Bai9);
        UCLN.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                @SuppressLint("CutPasteId") EditText a = findViewById(R.id.txt_so_a_bai9);
                @SuppressLint("CutPasteId") EditText b = findViewById(R.id.txt_so_b_bai9);

                if (a.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"a\"", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b.getText().toString().matches("")) {
                    Toast.makeText(bai9.this, "Missing number \"b\"", Toast.LENGTH_SHORT).show();
                    return;
                }
                kq.setText("UCLN(a,b): " + TimUCLN(Integer.parseInt(a.getText().toString()),
                        Integer.parseInt(b.getText().toString())));
            }
        });
    }

    public int TimUCLN(int a, int b) {
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if ( a < b){
            return TimUCLN(b,a);
        }
        if (b == 0) {
            return a;
        }
        return TimUCLN(b, a % b);
    }
}