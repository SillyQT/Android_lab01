package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_bai2 = findViewById(R.id.btn_Baitap2);
        Button btn_bai3 = findViewById(R.id.btn_Baitap3);
        Button btn_bai4 = findViewById(R.id.btn_Baitap4);
        Button btn_bai5 = findViewById(R.id.btn_Baitap5);
        Button btn_bai6 = findViewById(R.id.btn_Baitap6);
        Button btn_bai7 = findViewById(R.id.btn_Baitap7);
        Button btn_bai8 = findViewById(R.id.btn_Baitap8);
        Button btn_bai9 = findViewById(R.id.btn_Baitap9);
        Button btn_bai10 = findViewById(R.id.btn_Baitap10);

//        btn_bai2.setOnClickListener(this);
//        btn_bai3.setOnClickListener(this);
//        btn_bai4.setOnClickListener(this);
//        btn_bai5.setOnClickListener(this);
//        btn_bai6.setOnClickListener(this);
//        btn_bai7.setOnClickListener(this);
//        btn_bai8.setOnClickListener(this);
//        btn_bai9.setOnClickListener(this);

        btn_bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(2);
            }
        });

        btn_bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(3);
            }
        });
        btn_bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(4);
            }
        });
        btn_bai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(5);
            }
        });
        btn_bai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(6);
            }
        });
        btn_bai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(7);
            }
        });
        btn_bai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(8);
            }
        });

        btn_bai9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(9);
            }
        });
        btn_bai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(10);
            }
        });
    }

    public void openActivity(int num_activity) {
        switch (num_activity) {
            case 2:
                startActivity(new Intent(this, bai2.class));
                break;
            case 3:
                startActivity(new Intent(this, bai3.class));
                break;
            case 4:
                startActivity(new Intent(this, bai4.class));
                break;
            case 5:
                startActivity(new Intent(this, bai5.class));
                break;
            case 6:
                startActivity(new Intent(this, bai6.class));
                break;
            case 7:
                startActivity(new Intent(this, bai7.class));
                break;
            case 8:
                startActivity(new Intent(this, bai8.class));
                break;
            case 9:
                startActivity(new Intent(this, bai9.class));
                break;
            case 10:
                startActivity(new Intent(this, bai10.class));
                break;
            default:
                break;
        }
    }

//    @Override
//    public void onClick(View view, int num_activity) {
//        switch (num_activity){
//            case 2:
//                startActivity(new Intent(this, bai2.class));
//                break;
//            case 3:
//                startActivity(new Intent(this, bai3.class));
//                break;
//            case 4:
//                startActivity(new Intent(this, bai4.class));
//                break;
//            case 5:
//                startActivity(new Intent(this, bai5.class));
//                break;
//            case 6:
//                startActivity(new Intent(this, bai6.class));
//                break;
//            case 7:
//                startActivity(new Intent(this, bai7.class));
//                break;
//            case 8:
//                startActivity(new Intent(this, bai8.class));
//                break;
//            case 9:
//                startActivity(new Intent(this, bai9.class));
//                break;
//            default:
//                break;
//        }
//    }

}