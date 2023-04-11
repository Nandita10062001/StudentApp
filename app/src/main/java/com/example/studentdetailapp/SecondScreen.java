package com.example.studentdetailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondScreen extends AppCompatActivity {
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        textView = findViewById(R.id.text);
        ArrayList<String> numbersList = (ArrayList<String>) getIntent().getSerializableExtra("list");
        textView.setText(String.valueOf(numbersList));
    }
}