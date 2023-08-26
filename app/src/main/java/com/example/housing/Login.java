package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {


    AppCompatButton loginbtn;
    TextView resiterbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn=findViewById(R.id.loginbtn);
        resiterbtn=findViewById(R.id.resiterbtn);


        resiterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regint=new Intent(Login.this, third.class);
                startActivity(regint);
            }
        });


    }
}