package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class residentialNcommercial extends AppCompatActivity {

    Button residentialButton;
    private RadioGroup radioGroup;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residential_ncommercial);


//        radioGroup = findViewById(R.id.radio_group_commercial);
//
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//                if (checkedId == R.id.Office_Space) {
//                    Office_Space();
//                } else if (checkedId == R.id.Office_IT_Park_SEZ) {
//                    Office_IT_Park_SEZ();
//                } else if (checkedId == R.id.Shop){
//                    Shop();
//                } else if (checkedId==R.id.Showroom) {
//                    Showroom();
//                } else if (checkedId==R.id.Commercial_Land) {
//                    Commercial_Land();
//                } else if (checkedId==R.id.Warehouse_Godown) {
//                    Warehouse_Godown();
//                }else if (checkedId==R.id.Industrial_Land)
//                {
//                    Industrial_Land();
//                } else if (checkedId==R.id.Industrial_Building) {
//                    Industrial_Building();
//                }else if (checkedId==R.id.Industrial_Shed)
//                {
//                    Industrial_Shed();
//                } else if (checkedId==R.id.Agicultural_Land) {
//                    Agicultural_Land();
//                }
//
//
//
//            }
//        });

//        residentialButton = findViewById(R.id.residentialButton);
//
//        residentialButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Start the ResidentialActivity
//                Intent intent = new Intent(residentialNcommercial.this, residential.class);
//                startActivity(intent);
//            }
//        });

//        RadioGroup radioGroupOptions = findViewById(R.id.radio_group_options);
//
//        radioGroupOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton selectedRadioButton = findViewById(checkedId);
//                String selectedOption = selectedRadioButton.getText().toString();
//
//                Intent intent = new Intent(residentialNcommercial.this, whereyoulocated.class);
//                intent.putExtra("selectedOption", selectedOption);
//                startActivity(intent);
//            }
//        });


    }





    private void Office_Space() {
        Intent intent = new Intent(residentialNcommercial.this, activity_sub3_office.class);
        startActivity(intent);
    }

    private void Office_IT_Park_SEZ() {
        Intent intent = new Intent(residentialNcommercial.this, activity_sub3_office.class);
        startActivity(intent);
    }
    private void Shop() {
        Intent intent = new Intent(residentialNcommercial.this, activity_sub4_shop.class);
        startActivity(intent);
    }

    private void Showroom() {
        Intent intent = new Intent(residentialNcommercial.this, activity_sub4_shop.class);
        startActivity(intent);
    }
    private void Commercial_Land() {
        Intent intent = new Intent(residentialNcommercial.this, activity_sub2_commercialLand.class);
        startActivity(intent);
    }

    private void Warehouse_Godown() {
        Intent intent = new Intent(residentialNcommercial.this, sub7.class);
        startActivity(intent);
    }
    private void Industrial_Land() {
        Intent intent = new Intent(residentialNcommercial.this, Industrial_land.class);
        startActivity(intent);
    }

    private void Industrial_Building() {
        Intent intent = new Intent(residentialNcommercial.this, sub7.class);
        startActivity(intent);
    }

    private void Industrial_Shed() {
        Intent intent = new Intent(residentialNcommercial.this, sub7.class);
        startActivity(intent);
    }

    private void Agicultural_Land() {
        Intent intent = new Intent(residentialNcommercial.this, activity_sub6.class);
        startActivity(intent);
    }
}