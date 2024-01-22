package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bai10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai10);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn_CreateAccount_Bai10 = findViewById(R.id.btn_CreateAccount_Bai10);
        btn_CreateAccount_Bai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bai10.this, bai10_CreateAccount.class));
            }
        });
    }
}