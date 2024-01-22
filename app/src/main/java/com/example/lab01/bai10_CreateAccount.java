package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bai10_CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai10_create_account);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn_haveAccount_bai10 = findViewById(R.id.btn_haveAccount_bai10);
        btn_haveAccount_bai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bai10_CreateAccount.this.finish();
            }
        });
    }
}