package com.example.housing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapeterComercialRent extends FragmentPagerAdapter {
    public ViewPagerAdapeterComercialRent(@NonNull FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapeterComercialRent(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new CommercialFragment();
        }else {
            return new RentFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position==1){
            return "Residential";
        }else {
            return "Commercial";
        }
    }
}