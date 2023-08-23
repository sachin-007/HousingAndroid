package com.example.housing;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.util.Property;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.housing.adapters.PropertyAdapter;
import com.example.housing.models.Property;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class housing_listing extends AppCompatActivity {

    String jsonUrl = "https://gist.githubusercontent.com/sachin-007/6c1d996dafa9ecb427453bf900d0f2a1/raw/538b50fe2339acd7836663413cc2343abe3b2e3b/housing";

    private RecyclerView recyclerView;
    private PropertyAdapter propertyAdapter;

    private TextView priceTextView;
    private TextView sellerNameTextView;
    private TextView propertyByNameTextView;
    private TextView locationTextView;
    private TextView twinSharePriceTextView;
    private TextView tripleSharePriceTextView;


    private List<Property> properties;

    public void PropertyAdapter(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing_listing);



        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

// have to make changes in this

        priceTextView = findViewById(R.id.priceTextView);
        sellerNameTextView = findViewById(R.id.sellerNameTextView);
        propertyByNameTextView = findViewById(R.id.propertyByNameTextView);
        locationTextView = findViewById(R.id.locationTextView);
        twinSharePriceTextView = findViewById(R.id.twinSharePriceTextView);
        tripleSharePriceTextView = findViewById(R.id.tripleSharePriceTextView);

        fetchAndDisplayData();
    }
    private void fetchAndDisplayData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(jsonUrl);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = connection.getInputStream();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }

                    reader.close();
                    connection.disconnect();

                    String jsonResponse = response.toString();

                    Gson gson = new Gson();
                    Type propertyListType = new TypeToken<List<Property>>() {}.getType();
                    List<Property> properties = gson.fromJson(jsonResponse, propertyListType);

                    Property property = properties.get(0);

                    runOnUiThread(new Runnable() {

//                        propertyAdapter = new PropertyAdapter();
//                        propertyAdapter = new PropertyAdapter(properties);

                        @Override
                        public void run() {
                            priceTextView.setText(property.getPrice());
                            sellerNameTextView.setText(property.getProperty());
                            propertyByNameTextView.setText(property.getPropertyBy());
                            locationTextView.setText(property.getLocation());
                            twinSharePriceTextView.setText(property.getTwinSharePrice());
                            tripleSharePriceTextView.setText(property.getTripleSharePrice());
                        }
                    });

                    propertyAdapter = new PropertyAdapter(properties);
                    recyclerView.setAdapter(propertyAdapter);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}




//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
////import android.util.Property;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.lang.reflect.Type;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//import com.example.housing.adapters.PropertyAdapter;
//import com.example.housing.models.Property;
//import java.util.List;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
////
////public class housing_listing extends AppCompatActivity {
////
////    String jsonUrl = "https://gist.githubusercontent.com/sachin-007/6c1d996dafa9ecb427453bf900d0f2a1/raw/538b50fe2339acd7836663413cc2343abe3b2e3b/housing";
////
////    private RecyclerView recyclerView;
////    private PropertyAdapter propertyAdapter;
////
////    private TextView priceTextView;
////    private TextView sellerNameTextView;
////    private TextView propertyByNameTextView;
////    private TextView locationTextView;
////    private TextView twinSharePriceTextView;
////    private TextView tripleSharePriceTextView;
////
////
////    private List<Property> properties;
////
////    public PropertyAdapter(List<Property> properties) {
////        this.properties = properties;
////    }
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_housing_listing);
////
////
////
////        recyclerView = findViewById(R.id.recyclerView);
////        recyclerView.setLayoutManager(new LinearLayoutManager(this));
////
////        priceTextView = findViewById(R.id.priceTextView);
////        sellerNameTextView = findViewById(R.id.sellerNameTextView);
////        propertyByNameTextView = findViewById(R.id.propertyByNameTextView);
////        locationTextView = findViewById(R.id.locationTextView);
////        twinSharePriceTextView = findViewById(R.id.twinSharePriceTextView);
////        tripleSharePriceTextView = findViewById(R.id.tripleSharePriceTextView);
////
////        fetchAndDisplayData();
////    }
////    private void fetchAndDisplayData() {
////        new Thread(new Runnable() {
////            @Override
////            public void run() {
////                try {
////                    URL url = new URL(jsonUrl);
////                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
////                    InputStream inputStream = connection.getInputStream();
////
////                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
////                    StringBuilder response = new StringBuilder();
////                    String line;
////                    while ((line = reader.readLine()) != null) {
////                        response.append(line);
////                    }
////
////                    reader.close();
////                    connection.disconnect();
////
////                    String jsonResponse = response.toString();
////
////                    Gson gson = new Gson();
////                    Type propertyListType = new TypeToken<List<Property>>() {}.getType();
////                    List<Property> properties = gson.fromJson(jsonResponse, propertyListType);
////
////                    Property property = properties.get(0);
////
////                    runOnUiThread(new Runnable() {
////
////                        propertyAdapter = new PropertyAdapter(properties);
////
////                        @Override
////                        public void run() {
////                            priceTextView.setText(property.getPrice());
////                            sellerNameTextView.setText(property.getProperty());
////                            propertyByNameTextView.setText(property.getPropertyBy());
////                            locationTextView.setText(property.getLocation());
////                            twinSharePriceTextView.setText(property.getTwinSharePrice());
////                            tripleSharePriceTextView.setText(property.getTripleSharePrice());
////                        }
////                    });
////
////                    propertyAdapter = new PropertyAdapter(properties);
////                    recyclerView.setAdapter(propertyAdapter);
////
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////            }
////        }).start();
////    }
////}
//
//
//public class housing_listing extends AppCompatActivity {
//
//    String jsonUrl = "https://gist.githubusercontent.com/sachin-007/6c1d996dafa9ecb427453bf900d0f2a1/raw/538b50fe2339acd7836663413cc2343abe3b2e3b/housing";
//
//    private RecyclerView recyclerView;
//    private PropertyAdapter propertyAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_housing_listing);
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        fetchAndDisplayData();
//    }
//
//    private void fetchAndDisplayData() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    URL url = new URL(jsonUrl);
//                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                    InputStream inputStream = connection.getInputStream();
//
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//                    StringBuilder response = new StringBuilder();
//                    String line;
//                    while ((line = reader.readLine()) != null) {
//                        response.append(line);
//                    }
//
//                    reader.close();
//                    connection.disconnect();
//
//                    String jsonResponse = response.toString();
//
//                    Gson gson = new Gson();
//                    Type propertyListType = new TypeToken<List<Property>>() {}.getType();
//                    List<Property> properties = gson.fromJson(jsonResponse, propertyListType);
//
//
//                    Property property = properties.get(0);
//
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            priceTextView.setText(property.getPrice());
//                            sellerNameTextView.setText(property.getProperty());
//                            propertyByNameTextView.setText(property.getPropertyBy());
//                            locationTextView.setText(property.getLocation());
//                            twinSharePriceTextView.setText(property.getTwinSharePrice());
//                            tripleSharePriceTextView.setText(property.getTripleSharePrice());
//
//                            propertyAdapter = new PropertyAdapter(properties);
//                            recyclerView.setAdapter(propertyAdapter);
//                        }
//                        }
//                    });
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//}
//
