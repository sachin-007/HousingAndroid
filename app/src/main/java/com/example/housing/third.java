package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.housing.models.Propertyform;

import java.util.UUID;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class third extends AppCompatActivity {
    Button contfourth;
    private ApiService apiService;

    TextView loginbtn;

    private SharedPreferencesManager prefsManager;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        prefsManager = new SharedPreferencesManager(this);

        EditText passwordEditText = findViewById(R.id.password);

        passwordEditText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    int drawableRight = 2; // Index of the drawableEnd
                    if (event.getRawX() >= (view.getRight() - passwordEditText.getCompoundDrawables()[drawableRight].getBounds().width())) {
                        // Toggle input type between text and textPassword
                        if (passwordEditText.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
                            passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        } else {
                            passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        }
                        passwordEditText.setSelection(passwordEditText.getText().length()); // Keep cursor at the end

                        // Refresh the appearance of the EditText
                        passwordEditText.refreshDrawableState();

                        return true;
                    }
                }
                return false;
            }
        });


        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        loginbtn = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logint = new Intent(third.this, Login.class);
                startActivity(logint);
            }
        });

        contfourth = findViewById(R.id.contfourth);

       /* contfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Initialize Retrofit
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://dev.cofastudio.com/demo/reallist.php/adduser/") // Replace with your API base URL
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
                            Toast.makeText(third.this,"Registration successful",Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(third.this,"Registration Failed",Toast.LENGTH_SHORT).show();
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
*/

        contfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameEditText = findViewById(R.id.name);
                EditText emailEditText = findViewById(R.id.email);
                EditText passwordEditText = findViewById(R.id.password);
                EditText phoneEditText = findViewById(R.id.phone);

                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String phone = phoneEditText.getText().toString();

                if (name.length() < 6) {
                    nameEditText.setError("Name must be at least 6 characters");
                    return;
                }

                if (!isValidEmail(email)) {
                    emailEditText.setError("Enter a valid email");
                    return;
                }

                if (!isValidPassword(password)) {
                    passwordEditText.setError("Password must be at least 8 characters and contain one number, one capital letter, and one symbol");
                    return;
                }

                if (!isValidPhoneNumber(phone)) {
                    phoneEditText.setError("Enter a valid 10-digit phone number");
                    return;
                }

                // If all validations pass, proceed with making the POST request
                makePostRequest(name, email, password, phone);
            }
        });
    }


        // Helper functions for validation
        private boolean isValidEmail(String email) {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }

        private boolean isValidPassword(String password) {
            return password.length() >= 8 && containsNumber(password) && containsCapitalLetter(password) && containsSymbol(password);
        }

        private boolean isValidPhoneNumber(String phone) {
            return phone.length() == 10 && phone.matches("\\d{10}");
        }

        private boolean containsNumber(String text) {
            return Pattern.compile("[0-9]").matcher(text).find();
        }

        private boolean containsCapitalLetter(String text) {
            return Pattern.compile("[A-Z]").matcher(text).find();
        }

        private boolean containsSymbol(String text) {
            return Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]").matcher(text).find();
        }

        private void makePostRequest(String name, String email, String password, String phone) {
            // Initialize Retrofit

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://dev.cofastudio.com/demo/reallist.php/adduser/") // Replace with your API base URL
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiService = retrofit.create(ApiService.class);

            Propertyform property = new Propertyform();
            property.setName(name);
            property.setEmail(email);
            property.setPassword(password);
            property.setPhone(phone);
            property.setWho_i_am("User");


            Call<Void> call = apiService.createProperty(property);
//                Call<Propertyform> propertyCall = apiService.getPropertyWithUniqueId(uniqueId);

            call.enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(third.this,"Registration successful",Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(third.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                    // Handle failure
                    Log.e("POST Request", "Failure: " + t.getMessage());
                }
            });


            // Navigate to the next activity
            Intent intent = new Intent(third.this, CoustomDashboardActivity.class);
            startActivity(intent);


    }
}