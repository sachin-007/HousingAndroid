package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.example.housing.ApiService;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Login extends AppCompatActivity {

    TextView resiterbtn,forget;

    private EditText usernameEditText;
    private EditText passwordEditText;
    private AppCompatButton loginbtn;
    private SharedPreferencesManager prefsManager;

    private ApiService apiService;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText password = findViewById(R.id.password);

        password.setOnTouchListener(new View.OnTouchListener() {
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


        resiterbtn=findViewById(R.id.resiterbtn);
        forget=findViewById(R.id.forget);

        prefsManager = new SharedPreferencesManager(this);
        usernameEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        loginbtn = findViewById(R.id.loginButton);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://dev.cofastudio.com/demo/reallist.php/authenticate/") // Replace with your base URL
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                apiService = retrofit.create(ApiService.class);


                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();


                LoginRequest loginRequest = new LoginRequest(username, password);
                Call<UserResponse> call = apiService.authenticateUser(loginRequest);
                call.enqueue(new Callback<UserResponse>() {
                    @Override
                    public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                        if (response.isSuccessful()) {
                            UserResponse userResponse = response.body();
                            String userId = userResponse.getUserId();
                            prefsManager.saveUserId(userId);

                            // Show a success message

                            // Start your main activity
                            Toast.makeText(Login.this, "Login successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Login.this, CoustomDashboardActivity.class));
                            finish();
                        } else {
                            // Handle authentication failure
                            Toast.makeText(Login.this, "Login failed", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<UserResponse> call, Throwable t) {
                        // Handle failure
                        Toast.makeText(Login.this, "Login failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Login.this,com.example.housing.forget.class);
                startActivity(intent);

            }
        });

        resiterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regint=new Intent(Login.this, third.class);
                startActivity(regint);
            }
        });


    }
}