package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.housing.models.Propertyform;

import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class third extends AppCompatActivity {
    Button contfourth;
    private ApiService apiService;
    private EditText name,email,phone,password;

    TextView loginbtn;

    private SharedPreferencesManager prefsManager;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        prefsManager = new SharedPreferencesManager(this);




        ImageView backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        contfourth=findViewById(R.id.contfourth);

        contfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Initialize Retrofit
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://dev.cofastudio.com/demo/reallist.php/") // Replace with your API base URL
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                apiService = retrofit.create(ApiService.class);

                Propertyform property = new Propertyform();
//                property.setUniqueId(uniqueId);


                name=findViewById(R.id.name);
                email=findViewById(R.id.email);
                phone=findViewById(R.id.phone) ;
                password=findViewById(R.id.password);

                String nameText = name.getText().toString();
                String emailText = email.getText().toString();
                String phoneText = phone.getText().toString();

                property.setName(nameText);
                property.setEmail(emailText);
                property.setPhone(phoneText);
                property.setPassword(password.getText().toString());
                property.setWho_i_am("User");


                Call<Void> call = apiService.createProperty(property);
//                Call<Propertyform> propertyCall = apiService.getPropertyWithUniqueId(uniqueId);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        if (response.isSuccessful()) {
                            // POST request successful
                            Log.d("POST Request", "Success");
                        } else {
                            // Handle error
                            Log.e("POST Request", "Error: " + response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        // Handle failure
                        Log.e("POST Request", "Failure: " + t.getMessage());
                    }
                });




                Intent intent=new Intent(third.this,CoustomDashboardActivity.class);
                startActivity(intent);
            }
        });



        loginbtn=findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logint = new Intent(third.this,Login.class);
                startActivity(logint);
            }
        });

    }
}