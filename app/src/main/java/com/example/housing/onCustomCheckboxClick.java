package com.example.housing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class onCustomCheckboxClick extends Fragment {




    private boolean isChecked = false;
    private TextView customCheckbox;



    public onCustomCheckboxClick() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_addon, container, false);

        // Inflate the layout for this fragment
        customCheckbox = rootView.findViewById(R.id.customCheckbox);

        return rootView;
    }
    public void onCustomCheckboxClick(View view) {
        isChecked = !isChecked;
        updateCustomCheckboxAppearance();
    }

    private void updateCustomCheckboxAppearance() {
        if (isChecked) {
            customCheckbox.setCompoundDrawablesWithIntrinsicBounds(R.drawable.custom_checkbox_checked, 0, 0, 0);
        } else {
            customCheckbox.setCompoundDrawablesWithIntrinsicBounds(R.drawable.custom_checkbox_unchecked, 0, 0, 0);
        }
    }
}