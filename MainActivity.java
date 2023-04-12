package com.example.myfirstapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createBtn;
        EditText nameEdt, emailEdt, passEdt, confirmEdt;

        createBtn= findViewById(R.id.createBtn);
        nameEdt= findViewById(R.id.nameEdt);
        emailEdt= findViewById(R.id.emailEdt);
        passEdt= findViewById(R.id.passEdt);
        confirmEdt= findViewById(R.id.confirmEdt);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameEdt.getText().toString();
                String email=emailEdt.getText().toString();
                String pass=passEdt.getText().toString();
                String confirm=confirmEdt.getText().toString();

                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter name", Toast.LENGTH_SHORT).show();
                    nameEdt.setBackgroundResource(R.drawable.error_shape);
                    emailEdt.setBackgroundResource(R.drawable.change_background);
                    passEdt.setBackgroundResource(R.drawable.change_background);
                    confirmEdt.setBackgroundResource(R.drawable.change_background);

                }
                if (email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter email", Toast.LENGTH_SHORT).show();
                    nameEdt.setBackgroundResource(R.drawable.change_background);
                    emailEdt.setBackgroundResource(R.drawable.error_shape);
                    passEdt.setBackgroundResource(R.drawable.change_background);
                    confirmEdt.setBackgroundResource(R.drawable.change_background);
                }
                if (pass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                    nameEdt.setBackgroundResource(R.drawable.change_background);
                    emailEdt.setBackgroundResource(R.drawable.change_background);
                    passEdt.setBackgroundResource(R.drawable.error_shape);
                    confirmEdt.setBackgroundResource(R.drawable.change_background);
                }
                if (confirm.isEmpty()){
                    Toast.makeText(MainActivity.this, "confirm password", Toast.LENGTH_SHORT).show();
                    nameEdt.setBackgroundResource(R.drawable.change_background);
                    emailEdt.setBackgroundResource(R.drawable.change_background);
                    passEdt.setBackgroundResource(R.drawable.change_background);
                    confirmEdt.setBackgroundResource(R.drawable.error_shape);
                   
                }
                if (!pass.equals(confirm)){
                    Toast.makeText(MainActivity.this, "unmatched Passwords", Toast.LENGTH_SHORT).show();
                  confirmEdt.setBackgroundResource(R.drawable.error_shape);
                  passEdt.setBackgroundResource(R.drawable.error_shape);
                    nameEdt.setBackgroundResource(R.drawable.change_background);
                    emailEdt.setBackgroundResource(R.drawable.change_background);
                }
            }
        });






    }
}