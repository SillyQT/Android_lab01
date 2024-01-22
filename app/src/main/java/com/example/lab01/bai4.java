package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button_Timuocchung =
                findViewById(R.id.btn_Timuocchung);

        button_Timuocchung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView TV = findViewById(R.id.kq_Bai4);
                EditText so_a = findViewById(R.id.so_a);
                EditText so_b = findViewById(R.id.so_b);
                TV.setText(UocChungList(Integer.parseInt(so_a.getText().toString()),
                        Integer.parseInt(so_b.getText().toString())));
            }
        });

    }

    public static String UocChungList(int a, int b) {
        int temp = Math.min(a, b);
        StringBuilder list = new StringBuilder();
        do {
            if (a % temp == 0 && b % temp == 0) {
                list.append(temp);
                if (temp != 1)
                    list.append(" ;");
            }
            temp--;
        } while (temp > 0);

        list.reverse();
        return list.toString();
    }
}