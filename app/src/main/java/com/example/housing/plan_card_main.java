package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class plan_card_main extends AppCompatActivity {


    ImageView backimg;
    AppCompatButton choosebasic,chooseadvance,chooseaultra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_card_main);
        backimg=findViewById(R.id.backimage);


//        choosebasic=findViewById(R.id.choosebasic);
        chooseadvance=findViewById(R.id.chooseadvance);
        chooseaultra=findViewById(R.id.chooseultra);


        choosebasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(plan_card_main.this,AddOnPlan.class);
                startActivity(intent);
            }
        });
        chooseadvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(plan_card_main.this,AddOnPlan.class);
                startActivity(intent);
            }
        });
        chooseaultra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(plan_card_main.this,AddOnPlan.class);
                startActivity(intent);
            }
        });

        backimg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(plan_card_main.this,HomeDashboard.class);
                startActivity(intent);
            }
        });
    }
}