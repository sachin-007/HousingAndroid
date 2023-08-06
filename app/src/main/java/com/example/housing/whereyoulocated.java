package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class whereyoulocated extends AppCompatActivity {
    Button morerelvdet;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whereyoulocated);

        morerelvdet=findViewById(R.id.morerelvdet);

        morerelvdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(whereyoulocated.this,moredetailtogetreleventbuyers.class);
                startActivity(intent);
            }
        });

    }
}