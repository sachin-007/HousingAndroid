package com.example.housing;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
public class CoustomDashboardActivity extends AppCompatActivity {
    public SharedPreferencesManager prefsManager;

    AppCompatButton logologout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coustom_dashboard);

        prefsManager = new SharedPreferencesManager(this);

        logologout = findViewById(R.id.logologout);


        String userId = prefsManager.getUserId();
        if (userId == null) {
            // User not authenticated, redirect to login activity
            startActivity(new Intent(this, Login.class));
            finish();
        } else {
            // User is authenticated, proceed with main app logic
            // For example, load user data, set up UI, etc.
        }


        logologout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefsManager.remove();
                Intent logoutit = new Intent(CoustomDashboardActivity.this, Login.class);
                startActivity(logoutit);
            }
        });


    }
}