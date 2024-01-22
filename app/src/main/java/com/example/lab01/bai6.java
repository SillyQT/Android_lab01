package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bai6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);

        Button btn_chuyennam = findViewById(R.id.btn_chuyennam);
        btn_chuyennam.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView kq = findViewById(R.id.kq_bai6);
                EditText nam = findViewById(R.id.txt_nam);
                if (nam.getText().toString().matches("")) {
                    Toast.makeText( bai6.this , "You did not enter a Year",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                kq.setText("Năm âm lịch: " + NamAmLich(Integer.parseInt(nam.getText().toString())));
            }
        });
    }

    public String NamAmLich(int nam) {
        return (Can_Nam(nam) + " " + Chi_Nam(nam));
    }

    public String Can_Nam(int nam) {
        switch (nam % 10) {
            case 0:
                return "Canh";
            case 1:
                return "Tân";
            case 2:
                return "Nhâm";
            case 3:
                return "Quý";
            case 4:
                return "Giáp";
            case 5:
                return "Ất";
            case 6:
                return "Bính";
            case 7:
                return "Đinh";
            case 8:
                return "Mậu";
            case 9:
                return "Kỷ";
            default:
                return "NULL";
        }
    }
    public String Chi_Nam(int nam) {
        switch (nam % 12) {
            case 0:
                return "Thân";
            case 1:
                return "Dậu";
            case 2:
                return "Tuất";
            case 3:
                return "Hợi";
            case 4:
                return "Tý";
            case 5:
                return "Sửu";
            case 6:
                return "Dần";
            case 7:
                return "Mão";
            case 8:
                return "Thìn";
            case 9:
                return "Tị";
            case 10:
                return "Ngọ";
            case 11:
                return "Mùi";
            default:
                return "NULL";
        }
    }
}