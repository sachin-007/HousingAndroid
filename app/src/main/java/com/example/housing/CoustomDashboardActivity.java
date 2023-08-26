package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class CoustomDashboardActivity extends AppCompatActivity {
    private SharedPreferencesManager prefsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coustom_dashboard);

        prefsManager = new SharedPreferencesManager(this);

        Log.d("CustomDashboardActivity", "Activity created"); // Add this line


        String userId = prefsManager.getUserId();
        if (userId == null) {
            // User not authenticated, redirect to login activity
            startActivity(new Intent(this, Login.class));
            finish();
        } else {
            // User is authenticated, proceed with main app logic
            // For example, load user data, set up UI, etc.
        }




    }
}