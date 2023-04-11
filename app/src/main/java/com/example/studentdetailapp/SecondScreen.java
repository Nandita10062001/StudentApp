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
        ArrayList<String> fetch = (ArrayList<String>) getIntent().getSerializableExtra("array_list");
        fetch= getIntent().getStringArrayListExtra("array_list");
        textView.setText(String.valueOf(fetch));
    }
}