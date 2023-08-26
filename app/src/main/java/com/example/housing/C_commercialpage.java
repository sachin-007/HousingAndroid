package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class C_commercialpage extends AppCompatActivity {



    TextView bhk1,bhk2,posted1,posted2,posted3,any1,any2,any3,any4,any5,any6,any7,any8,sale1,sale2;

    LinearLayout buyProp,leaseProp;

    boolean isBhkSelected;
    boolean ispostedSelected;
    boolean isany_Selected;
    boolean issale_Selected;
    byte selectedCount1;
    byte selectedCount2;
    byte selectedCount4;

    private boolean isBuyPropVisible = false;


    byte selectedCount5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccommercialpage);


//        buyProp=findViewById(R.id.buyProp);
//        leaseProp=findViewById(R.id.leaseProp);
        buyProp = findViewById(R.id.buyprop);
//
//
//        bhk1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBuyPropVisible) {
//                    buyProp.setVisibility(View.GONE);
//                } else {
//                    buyProp.setVisibility(View.VISIBLE);
//                }
//                isBuyPropVisible = !isBuyPropVisible;
//
//                }
//        });


//        bhk1.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceType")
//            @Override
//            public void onClick(View view) {


        // Toggle BuyProp layout visibility
//                if (isBuyPropVisible) {
//                    buyProp.setVisibility(View.GONE);
//                } else {
//                    buyProp.setVisibility(View.VISIBLE);
//                }
//                isBuyPropVisible = !isBuyPropVisible;

//
//                    if (selectedCount1<=2){
//                        if (!isBhkSelected){
//                            bhk1.setBackgroundResource(R.drawable.pinkbox1);
//                            isBhkSelected = true;
//                            selectedCount1++;
//                        }else {
//                            bhk1.setBackgroundResource(R.drawable.textboxwhite);
//                            isBhkSelected = false;
//                            selectedCount1--;
//                        }
//                    }
//                    else {
//                        Toast.makeText(C_commercialpage.this,"you can selected 2 option",Toast.LENGTH_SHORT).show();
//                    }
//            }
//
//
//        });

//        bhk2.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceType")
//            @Override
//            public void onClick(View view) {
//                if (selectedCount1<=2){
//                    if (!isBhkSelected){
//                        bhk2.setBackgroundResource(R.drawable.pinkbox1);
//                        isBhkSelected = true;
//                        selectedCount1++;
//                    }else {
//                        bhk1.setBackgroundResource(R.drawable.textboxwhite);
//                        isBhkSelected = false;
//                        selectedCount1--;
//                    }
//                }
//                else {
//                    Toast.makeText(C_commercialpage.this,"you can selected 2 option",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }
}