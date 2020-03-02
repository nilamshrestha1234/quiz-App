package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView tvscore;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        tvscore=findViewById(R.id.tvscore);


        value=getIntent().getStringExtra("result");
        tvscore.setText("Your Score"+value);

    }
}
