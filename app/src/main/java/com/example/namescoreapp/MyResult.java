package com.example.namescoreapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;
import java.util.stream.IntStream;

public class MyResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_MYNAME);
        TextView nameLabel = findViewById(R.id.nameLabel);
        nameLabel.setText(myName + "さんの点数は...");

        Random randomGenerator = new Random();
        int score = randomGenerator.nextInt(101);
        TextView scoreLabel = findViewById(R.id.scoreLabel);
        scoreLabel.setText(score + "点!!");

    }
}