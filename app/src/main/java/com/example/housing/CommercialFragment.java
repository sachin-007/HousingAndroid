package com.example.housing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class CommercialFragment extends Fragment {


    public CommercialFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.fragment_commercial, container, false);

        LinearLayout Office_Space = rootView.findViewById(R.id.Office_Space);
        Office_Space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), activity_sub3_office.class);
                startActivity(intent);
            }
        });

        LinearLayout Office_IT_Park_SEZ = rootView.findViewById(R.id.Office_IT_Park_SEZ);
        Office_IT_Park_SEZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), activity_sub3_office.class);
                startActivity(intent);
            }
        });


        LinearLayout Shop = rootView.findViewById(R.id.Shop);
        Shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), activity_sub4_shop.class);
                startActivity(intent);
            }
        });


        LinearLayout Showroom = rootView.findViewById(R.id.Showroom);
        Showroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), activity_sub4_shop.class);
                startActivity(intent);
            }
        });


        LinearLayout Commercial_Land = rootView.findViewById(R.id.Commercial_Land);
        Commercial_Land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), activity_sub2_commercialLand.class);
                startActivity(intent);
            }
        });

        LinearLayout Warehouse_Godown = rootView.findViewById(R.id.Warehouse_Godown);
        Warehouse_Godown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), sub7.class);
                startActivity(intent);
            }
        });


        LinearLayout Industrial_Land = rootView.findViewById(R.id.Industrial_Land);
        Industrial_Land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), Industrial_land.class);
                startActivity(intent);
            }
        });



        LinearLayout Industrial_Building = rootView.findViewById(R.id.Industrial_Building);
        Industrial_Building.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), sub7.class);
                startActivity(intent);
            }
        });


        LinearLayout Industrial_Shed = rootView.findViewById(R.id.Industrial_Shed);
        Industrial_Shed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), sub7.class);
                startActivity(intent);
            }
        });


        LinearLayout Agicultural_Land = rootView.findViewById(R.id.Agicultural_Land);
        Agicultural_Land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent for the first layout
                Intent intent = new Intent(getActivity(), activity_sub6.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}