package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Ready_to_const_popup extends AppCompatActivity {

    private PopupWindow popupWindow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready_to_const_popup);



        View popupView = LayoutInflater.from(this).inflate(R.layout.activity_ready_to_const_popup, null);
        popupWindow = new PopupWindow(popupView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT, true);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnReadyToMove = findViewById(R.id.btn_ready_to_move );
        btnReadyToMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView option1 = popupView.findViewById(R.id.option1);
                TextView option2 = popupView.findViewById(R.id.option2);

                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Handle option 1 selection
                        popupWindow.dismiss();
                    }
                });

                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Handle option 2 selection
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(v);
            }
        });




    }
}