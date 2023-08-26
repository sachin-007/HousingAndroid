package com.example.housing;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {
    private static final String PREF_NAME = "MyPrefs";
    private static final String USER_ID_KEY = "user_id";

    private SharedPreferences prefs;

    public SharedPreferencesManager(Context context) {
        prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void saveUserId(String userId) {
        prefs.edit().putString(USER_ID_KEY, userId).apply();
    }

    public String getUserId() {
        return prefs.getString(USER_ID_KEY, null);
    }
}
