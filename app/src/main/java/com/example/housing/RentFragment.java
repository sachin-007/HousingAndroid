package com.example.housing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class RentFragment extends Fragment {



    public RentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_rent, container, false);


        LinearLayout Falt_Apartment = rootView.findViewById(R.id.Falt_Apartment);
        Falt_Apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), sub1_flat_apartment.class);
                startActivity(intent);
            }
        });

        LinearLayout House = rootView.findViewById(R.id.House);
        House.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), moredetailtogetreleventbuyers.class);
                startActivity(intent);
            }
        });

        LinearLayout Villa = rootView.findViewById(R.id.Villa);
        Villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), moredetailtogetreleventbuyers.class);
                startActivity(intent);
            }
        });

        LinearLayout Builder_Floor = rootView.findViewById(R.id.Builder_Floor);
        Builder_Floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), BuilderFloor.class);
                startActivity(intent);
            }
        });

        LinearLayout Plot = rootView.findViewById(R.id.Plot);
        Plot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), activity_sub5_plt_width_any_boundary_gated_property_approval.class);
                startActivity(intent);
            }
        });

        LinearLayout Studio_Apartment = rootView.findViewById(R.id.Studio_Apartment);
        Studio_Apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), studio.class);
                startActivity(intent);
            }
        });

        LinearLayout Penthouse = rootView.findViewById(R.id.Penthouse);
        Penthouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), penthouse.class);
                startActivity(intent);
            }
        });

        LinearLayout farm_House = rootView.findViewById(R.id.farm_House);
        farm_House.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the second layout
                Intent intent = new Intent(getActivity(), farm_house.class);
                startActivity(intent);
            }
        });



        return rootView;


    }



}
