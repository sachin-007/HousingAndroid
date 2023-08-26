package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.UUID;

public class secact extends AppCompatActivity {


//    SharedPreferencesManager prefsManager = new SharedPreferencesManager(this);
//    String uniqueId = prefsManager.getUniqueId();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secact);


        ImageView backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(secact.this, CoustomDashboardActivity.class);
                startActivity(intent);
            }
        });




        RadioGroup radioGroupOptions = findViewById(R.id.radio_group_options);

        radioGroupOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedOption = selectedRadioButton.getText().toString();
                switch (selectedOption) {
                    case "I am an Owner":
                        selectedOption = "Owner";
                        break;
                    case "I am Agent":
                        selectedOption = "Agent";
                        break;
                    case "I am Builder":
                        selectedOption = "Builder";
                        break;
                }






                Intent intent = new Intent(secact.this, fourth.class);

                intent.putExtra("selectedOption", selectedOption);
                startActivity(intent);
            }
        });


    }
}