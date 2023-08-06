package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reccommercial extends AppCompatActivity {

    Button residentialButton,commercialButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reccommercial);

        commercialButton = findViewById(R.id.commercialButton);
        residentialButton = findViewById(R.id.residentialButton);

        commercialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the CommercialActivity
                Intent intent = new Intent(reccommercial.this, residentialNcommercial.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for the residential button
        residentialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ResidentialActivity
                Intent intent = new Intent(reccommercial.this, residential.class);
                startActivity(intent);
            }
        });


    }
}