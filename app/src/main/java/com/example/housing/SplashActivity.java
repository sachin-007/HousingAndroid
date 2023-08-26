package com.example.housing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferencesManager prefsManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initialize SharedPreferencesManager
        prefsManager = new SharedPreferencesManager(this);

        // Delay for splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                redirectToAppropriateActivity();
            }
        }, 1000); // 2 seconds delay
    }

    private void redirectToAppropriateActivity() {
        String userId = prefsManager.getUserId();
        if (userId != null) {
            // User has a user_id, redirect to custom dashboard
            startActivity(new Intent(this, CoustomDashboardActivity.class));
        } else {
            // User not authenticated, redirect to login activity
            startActivity(new Intent(this, Login.class));
        }
        finish(); // Close the splash activity
    }


}
