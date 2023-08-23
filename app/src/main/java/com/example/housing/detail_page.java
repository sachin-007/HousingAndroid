package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.housing.models.detailproperty;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
//
public class detail_page extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing_listing);

//
//
//
//    private ImageView thumbnailImage;
////    private TextView buildingName;
////    private TextView priceTextView;
////    private TextView developedBy;
//    private TextView priceofflat;
//    private TextView flatof;
//    private TextView propertyByName;
//    private TextView propertylocation;
//    private TextView agentname;
//    private TextView agentnumber;
//    private TextView depossiteprice;
//    private TextView maintenancetype;
//    private TextView depossitedprice;
//    private TextView socitylocation;
//    private TextView location;
//    private TextView relocatestatus;
//    private TextView projectarea;
//    private TextView raraid;
//    private TextView sizeunit;
//    private TextView buildername;
//    private TextView propertyby;
//
//    private List<detailproperty> fetchDataFromJsonApi() {
//        List<detailproperty> properties = null;
//
//        try {
//            // Create a URL object with the API URL
//            URL url = new URL("https://gist.githubusercontent.com/sachin-007/920c5969b9af2fa874186d114c67e996/raw/886133efe89a32c935cffd741089db1b3db9619c/gistfile1.txt");
//
//            // Open a connection to the URL
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Set up input stream to read data
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//
//            // Close the connection
//            connection.disconnect();
//
//            // Convert JSON string to list of detailproperty objects using Gson
//            Gson gson = new Gson();
//            Type propertyListType = new TypeToken<List<detailproperty>>() {}.getType();
//            properties = gson.fromJson(response.toString(), propertyListType);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return properties;
//    }
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail_page);
//
//        thumbnailImage = findViewById(R.id.thumbnelid);
//        priceofflat =findViewById(R.id.priceofflat);
//        flatof =findViewById(R.id.flatof);
//        propertyByName =findViewById(R.id.propertyByName);
//        propertylocation =findViewById(R.id.propertylocation);
//        agentname =findViewById(R.id.agentname);
//        agentnumber =findViewById(R.id.agentnumber);
//        depossiteprice =findViewById(R.id.depossiteprice);
//        maintenancetype =findViewById(R.id.maintenancetype);
//        depossitedprice =findViewById(R.id.depossitedprice);
//        socitylocation =findViewById(R.id.socitylocation);
//        location =findViewById(R.id.location);
//        relocatestatus =findViewById(R.id.relocatestatus);
//        projectarea =findViewById(R.id.projectarea);
//        raraid =findViewById(R.id.raraid);
//        sizeunit =findViewById(R.id.sizeunit);
//        buildername =findViewById(R.id.buildername);
//        propertyby =findViewById(R.id.propertyby);
//
//
//        List<detailproperty> properties = fetchDataFromJsonApi();
//        detailproperty property = properties.get(0);
//
//        buildername.setText(property.getBuildername());
//        priceofflat.setText(property.getPriceofflat());
//        flatof.setText(property.getFlatof());
//        propertyByName.setText(property.getPropertyby());
//        propertylocation.setText(property.getPropertylocation());
//        agentname.setText(property.getAgentname());
//        agentnumber.setText(property.getAgentnumber());
//        depossiteprice.setText(property.getDepossiteprice());
//        maintenancetype.setText(property.getMaintenancetype());
//        depossitedprice.setText(property.getDepossitedprice());
//        socitylocation.setText(property.getSocitylocation());
//        location.setText(property.getLocation());
//        relocatestatus.setText(property.getRelocatestatus());
//        projectarea.setText(property.getProjectarea());
//        raraid.setText(property.getRaraid());
//        sizeunit.setText(property.getSizeunit());
//        buildername.setText(property.getBuildername());
//        propertyby.setText(property.getPropertyby());
//
//        // Load and display thumbnail image using Glide
//        Glide.with(this)
//                .load(property. getThumbnailImage())
//                .into(thumbnailImage);
//
    }
}