package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class price_you_expect extends AppCompatActivity {

    Button tostatofprop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_you_expect);

        tostatofprop=findViewById(R.id.tostatofprop);

        tostatofprop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(price_you_expect.this,status_of_property.class);
                startActivity(intent);
            }
        });
    }
}