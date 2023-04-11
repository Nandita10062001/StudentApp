package com.example.studentdetailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondScreen extends AppCompatActivity {
  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        listView = findViewById(R.id.list);

        ArrayList<String> numbersList = (ArrayList<String>) getIntent().getSerializableExtra("list");
        String l[] = numbersList.toArray(new String[numbersList.size()]);

        ArrayAdapter<String> arr = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                l);
        listView.setAdapter(arr);
    }
}