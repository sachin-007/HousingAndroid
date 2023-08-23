package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class moredetailtogetreleventbuyers extends AppCompatActivity {

    Button topiceaccept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moredetailtogetreleventbuyers);



        ImageView backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



        topiceaccept = findViewById(R.id.topiceaccept);


        // Get references to views
        EditText editTextSquareFoot = findViewById(R.id.edit_text_square_foot);
        Spinner spinnerUnit = findViewById(R.id.spinner_unit);

        // Define the units for the Spinner
        String[] units = {"sqft", "sqyrd", "sqm", "Acre", "Bighe", "Hectare", "Marla"};

        // Create an ArrayAdapter with the units and set it to the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, units);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUnit.setAdapter(adapter);


        topiceaccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(moredetailtogetreleventbuyers.this, price_you_expect.class);
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

