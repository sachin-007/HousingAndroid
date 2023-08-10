package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ApplicationView extends AppCompatActivity {

ListView listview;
Spinner Spinnerbed;

    private TextView tvDropdown;
    private Spinner spinnerOptions;
    private TextView lastitem;



    //int arrno[]=new int[]{4,5,6,7,8,9,10};
ArrayList<Integer> arrno = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_view);

        spinnerOptions = findViewById(R.id.spinnerOptions);
        lastitem = findViewById(R.id.lastitem);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.roomsfloors, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(spinnerAdapter);

        lastitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerOptions.performClick(); // Programmatically show dropdown
                spinnerOptions.setVisibility(View.VISIBLE);
            }
        });



        spinnerOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = parent.getItemAtPosition(position).toString();
                lastitem.setText(selectedOption);
                spinnerOptions.setVisibility(View.GONE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });




    }
}

