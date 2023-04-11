package com.example.studentdetailapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText firstName, lastName, email, phone;
    private Button submit,view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.StudentName);
        lastName = findViewById(R.id.StudentLast);
        email = findViewById(R.id.StudentEmail);
        phone = findViewById(R.id.StudentPhone);
        submit = findViewById(R.id.registerButton);
        view = findViewById(R.id.ViewBtn);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String fName = firstName.getText().toString().trim();
                final String lName = lastName.getText().toString().trim();
                final String mobile = phone.getText().toString().trim();
                final String Email = email.getText().toString().trim();

                if(fName.isEmpty())
                {
                    firstName.setError("Please fill in  your First Name!");
                    firstName.requestFocus();
                    return;
                }
                if(Email.isEmpty())
                {
                    email.setError("Enter your Email!");
                    email.requestFocus();
                    return;
                }
                if(lName.isEmpty())
                {
                    lastName.setError("Please fill in  your Last Name!");
                    lastName.requestFocus();
                    return;
                }
                if(mobile.isEmpty())
                {
                    phone.setError("Mention Your Mobile Number!");
                    phone.requestFocus();
                    return;
                }
                if(mobile.length()<10){
                    phone.setError("Enter a valid phone number!");
                    phone.requestFocus();
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches())
                {
                    email.setError("Please enter a valid Email Address!");
                    email.requestFocus();
                }
               ArrayList<String> arr = new ArrayList<String>();
               arr.add(fName);
               arr.add(lName);
               arr.add(Email);
               arr.add(mobile);
               System.out.println("The list: " +arr);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,SecondScreen.class);
                        intent.putExtra("list", arr);
                        startActivity(intent);

                    }
                });
            }

        });
    }
}