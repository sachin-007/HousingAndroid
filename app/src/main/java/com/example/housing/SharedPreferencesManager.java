package com.example.housing;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {
    private static final String PREF_NAME = "MyPrefs";

    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    public SharedPreferencesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveUniqueId(String uniqueId) {
        editor.putString("UniqueId", uniqueId);
        editor.apply();
    }

    public String getUniqueId() {
        return sharedPreferences.getString("UniqueId", null);
    }
}
