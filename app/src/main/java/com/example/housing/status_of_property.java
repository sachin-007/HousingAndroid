package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class status_of_property extends AppCompatActivity {

    Button nextotppg;

    private Spinner spinner;
    private TextView selectedOptionTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_of_property);

        nextotppg=findViewById(R.id.nextotppg);

        nextotppg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(status_of_property.this,otpverify_number.class);
                startActivity(intent);
            }
        });

//        spinner = findViewById(R.id.spinner_options);
//
//        Button btnUnderConstruction = findViewById(R.id.btn_under_construction);
//        Button btnReadyToMove = findViewById(R.id.btn_ready_to_move);
//
//        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.options_array, android.R.layout.simple_spinner_item);
//        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(spinnerAdapter);
//
//        btnUnderConstruction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showSpinner();
//            }
//        });
//
//        btnReadyToMove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showSpinner();
//            }
//        });
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                // Handle spinner item selection if needed
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // Do nothing
//            }
//        });
//    }
//
//    private void showSpinner() {
//        spinner.setVisibility(View.VISIBLE);




        spinner = findViewById(R.id.spinner_options);
        selectedOptionTextView = findViewById(R.id.selected_option_textview);

        Button btnUnderConstruction = findViewById(R.id.btn_under_construction);
        Button btnReadyToMove = findViewById(R.id.btn_ready_to_move);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.options_array, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        btnUnderConstruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSpinner();
            }
        });

        btnReadyToMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSpinner();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = parent.getItemAtPosition(position).toString();
                selectedOptionTextView.setText(selectedOption);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
    }


    private void showSpinner() {
        spinner.setVisibility(View.VISIBLE);
        selectedOptionTextView.setText("");

    }
}