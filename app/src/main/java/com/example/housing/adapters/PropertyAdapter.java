//package com.example.housing.adapters;
//
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import com.bumptech.glide.Glide;
//import com.example.housing.R;
//import com.example.housing.models.Property;
//import java.util.List;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//public class PropertyAdapter  extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {
//
//    private List<Property> propertyList;
//
//    public PropertyAdapter(List<Property> propertyList) {
//        this.propertyList = propertyList;
//    }
//
//    @NonNull
//    @Override
//    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_housing_listing, parent, false);
//        return new PropertyViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
//        Property property = propertyList.get(position);
//        holder.bind(property);
//    }
//
//    @Override
//    public int getItemCount() {
//        return propertyList.size();
//    }
//
//
//    public class PropertyViewHolder extends RecyclerView.ViewHolder {
//
////        private ImageView propertyimageview;
//
//        private TextView priceTextView;
//        private TextView sellerNameTextView;
//        private TextView propertyByNameTextView;
//        private TextView locationTextView;
//        private TextView twinSharePriceTextView;
//        private TextView tripleSharePriceTextView;
//
//
//
//
////        public PropertyViewHolder(@NonNull View itemView) {
////            super(itemView);
//////            propertyimageview = itemView.findViewById(R.id.propertyimageview);
////            priceTextView = itemView.findViewById(R.id.priceTextView);
////            sellerNameTextView = itemView.findViewById(R.id.sellerNameTextView);
////            propertyByNameTextView = itemView.findViewById(R.id.propertyByNameTextView);
////            locationTextView = itemView.findViewById(R.id.locationTextView);
////            twinSharePriceTextView = itemView.findViewById(R.id.twinSharePriceTextView);
////            tripleSharePriceTextView = itemView.findViewById(R.id.tripleSharePriceTextView);
////        }
////
////        public void bind(Property property) {
////            // Populate UI elements with data from the Property object
//////            Glide.with(itemView.getContext())
//////                    .load(property.getImage())
//////                    .into(propertyimageview);
////            priceTextView.setText(property.getPrice());
////            sellerNameTextView.setText(property.getProperty());
////            propertyByNameTextView.setText(property.getPropertyBy());
////            locationTextView.setText(property.getLocation());
////            twinSharePriceTextView.setText(property.getTwinSharePrice());
////            tripleSharePriceTextView.setText(property.getTripleSharePrice());
////        }
//
//
//
//        public PropertyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            priceTextView = itemView.findViewById(R.id.priceTextView);
//            sellerNameTextView = itemView.findViewById(R.id.sellerNameTextView);
//            propertyByNameTextView = itemView.findViewById(R.id.propertyByNameTextView);
//            locationTextView = itemView.findViewById(R.id.locationTextView);
//            twinSharePriceTextView = itemView.findViewById(R.id.twinSharePriceTextView);
//            tripleSharePriceTextView = itemView.findViewById(R.id.tripleSharePriceTextView);
//        }
//
//        public void bind(Property property) {
//            priceTextView.setText(property.getPrice());
//            sellerNameTextView.setText(property.getProperty());
//            propertyByNameTextView.setText(property.getPropertyBy());
//            locationTextView.setText(property.getLocation());
//            twinSharePriceTextView.setText(property.getTwinSharePrice());
//            tripleSharePriceTextView.setText(property.getTripleSharePrice());
//        }
//
//
//    }
//}



package com.example.housing.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.housing.R;
import com.example.housing.models.Property;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PropertyAdapter  extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    private List<Property> propertyList;

    public PropertyAdapter(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_property, parent, false);
        return new PropertyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        Property property = propertyList.get(position);
        holder.bind(property);
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    public class PropertyViewHolder extends RecyclerView.ViewHolder {

//        private ImageView propertyimageview;
        private TextView priceTextView;
        private TextView sellerNameTextView;
        private TextView propertyByNameTextView;
        private TextView locationTextView;
        private TextView twinSharePriceTextView;
        private TextView tripleSharePriceTextView;

        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);
//            propertyimageview = itemView.findViewById(R.id.propertyimageview);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            sellerNameTextView = itemView.findViewById(R.id.sellerNameTextView);
            propertyByNameTextView = itemView.findViewById(R.id.propertyByNameTextView);
            locationTextView = itemView.findViewById(R.id.locationTextView);
            twinSharePriceTextView = itemView.findViewById(R.id.twinSharePriceTextView);
            tripleSharePriceTextView = itemView.findViewById(R.id.tripleSharePriceTextView);
        }

        public void bind(Property property) {
            // Populate UI elements with data from the Property object
//            Glide.with(itemView.getContext())
//                    .load(property.getImage())
//                    .into(propertyimageview);
            priceTextView.setText(property.getPrice());
            sellerNameTextView.setText(property.getProperty());
            propertyByNameTextView.setText(property.getPropertyBy());
            locationTextView.setText(property.getLocation());
            twinSharePriceTextView.setText(property.getTwinSharePrice());
            tripleSharePriceTextView.setText(property.getTripleSharePrice());
        }
    }
}

//public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {
//
//    private List<Property> propertyList;
//
//    public PropertyAdapter(List<Property> propertyList) {
//        this.propertyList = propertyList;
//    }
//
//    @NonNull
//    @Override
//    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_housing_listing, parent, false);
//        return new PropertyViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
//        Property property = propertyList.get(position);
//        holder.bind(property);
//    }
//
//    @Override
//    public int getItemCount() {
//        return propertyList.size();
//    }
//
//    public class PropertyViewHolder extends RecyclerView.ViewHolder {
//
//        private TextView priceTextView;
//        private TextView sellerNameTextView;
//        private TextView propertyByNameTextView;
//        private TextView locationTextView;
//        private TextView twinSharePriceTextView;
//        private TextView tripleSharePriceTextView;
//
//        public PropertyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            priceTextView = itemView.findViewById(R.id.priceTextView);
//            sellerNameTextView = itemView.findViewById(R.id.sellerNameTextView);
//            propertyByNameTextView = itemView.findViewById(R.id.propertyByNameTextView);
//            locationTextView = itemView.findViewById(R.id.locationTextView);
//            twinSharePriceTextView = itemView.findViewById(R.id.twinSharePriceTextView);
//            tripleSharePriceTextView = itemView.findViewById(R.id.tripleSharePriceTextView);
//        }
//
//        public void bind(Property property) {
//            priceTextView.setText(property.getPrice());
//            sellerNameTextView.setText(property.getProperty());
//            propertyByNameTextView.setText(property.getPropertyBy());
//            locationTextView.setText(property.getLocation());
//            twinSharePriceTextView.setText(property.getTwinSharePrice());
//            tripleSharePriceTextView.setText(property.getTripleSharePrice());
//        }
//    }
//}
