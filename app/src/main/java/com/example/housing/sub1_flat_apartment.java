package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class sub1_flat_apartment extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1_flat_apartment);


        AppCompatButton topiceaccept=findViewById(R.id.topiceaccept);

        ImageView backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        topiceaccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sub1_flat_apartment.this, otpverify_number.class);
                startActivity(intent);
            }

        });




        Spinner unitSpinner = findViewById(R.id.unitvalues);
        Spinner unitSpinner1 = findViewById(R.id.unitvalues1);

        ArrayAdapter<CharSequence> unitAdapter = new ArrayAdapter<CharSequence>(
                this,
                android.R.layout.simple_spinner_item, // Default layout for all items
                getResources().getStringArray(R.array.unitvalues)
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Change text color of the selected item to black
                if (position == unitSpinner.getSelectedItemPosition()) {
                    TextView textView = (TextView) view.findViewById(android.R.id.text1);
                    textView.setTextColor(Color.BLACK);
                }

                return view;
            }
        };

        unitAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner.setAdapter(unitAdapter);



        ArrayAdapter<CharSequence> unitAdapter1 = new ArrayAdapter<CharSequence>(
                this,
                android.R.layout.simple_spinner_item, // Default layout for all items
                getResources().getStringArray(R.array.unitvalues)
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Change text color of the selected item to black
                if (position == unitSpinner1.getSelectedItemPosition()) {
                    TextView textView = (TextView) view.findViewById(android.R.id.text1);
                    textView.setTextColor(Color.BLACK);
                }

                return view;
            }
        };

        unitAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner1.setAdapter(unitAdapter1);
        }



}