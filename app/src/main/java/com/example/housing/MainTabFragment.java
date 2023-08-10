package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainTabFragment extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab_fragment);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viwerpage);

        ViewPagerAdapeterComercialRent viewPagerAdapeterComercialRent = new ViewPagerAdapeterComercialRent(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapeterComercialRent);

        tab.setupWithViewPager(viewPager);
    }
}