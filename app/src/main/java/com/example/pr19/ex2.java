package com.example.pr19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex2 extends AppCompatActivity {

    private TextView textView;
    private Button buttonTime;
    private Button buttonDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        textView = findViewById(R.id.textView);
        buttonTime = findViewById(R.id.buttonTime);
        buttonDate = findViewById(R.id.buttonDate);

        buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long currentTime = System.currentTimeMillis();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                textView.setText(sdf.format(currentTime));
            }
        });

        buttonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date currentDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                textView.setText(sdf.format(currentDate));
            }
        });
    }
}