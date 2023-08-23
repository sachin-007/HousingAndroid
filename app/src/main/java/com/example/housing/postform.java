package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class postform extends AppCompatActivity {
    private LinearLayout commerciallayout;
    private TextView residentialbtn;
    private TextView commercialbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postform);

        commerciallayout = findViewById(R.id.commerciallayout);
        residentialbtn = findViewById(R.id.residentialbtn);
        commercialbtn = findViewById(R.id.commercialbtn);

        residentialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleHiddenLayout();
            }
        });

        commercialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleHiddenLayout();
            }
        });


    }

    private void toggleHiddenLayout() {
        if (commerciallayout.getVisibility() == View.VISIBLE) {
            commerciallayout.setVisibility(View.GONE);
        } else {
            commerciallayout.setVisibility(View.VISIBLE);
        }
    }
}