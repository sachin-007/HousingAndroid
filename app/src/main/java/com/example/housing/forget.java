package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class forget extends AppCompatActivity {


    private EditText emaile,newpassworde,passwordEditText;
    private AppCompatButton forgetButtone;
    private ApiService apiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        passwordEditText=findViewById(R.id.newpassword);

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

        emaile=findViewById(R.id.email);
        newpassworde =findViewById(R.id.newpassword);
        forgetButtone=findViewById(R.id.forgetButton);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://dev.cofastudio.com/demo/reallist.php/forget/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService=retrofit.create(ApiService.class);

        forgetButtone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=emaile.getText().toString();
                String newPassword=newpassworde.getText().toString();

                ForgetPasswordRequest request = new ForgetPasswordRequest(email, newPassword);

                Call<ResponseBody> call = apiService.forgetPassword(request);

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.isSuccessful()) {
                            // Handle successful response
                            showToast("Password changed successfully.");
                        } else {
                            // Handle error response
                            if (response.errorBody() != null) {
                                try {
                                    String errorResponse = response.errorBody().string();
                                    ErrorResponse error = new Gson().fromJson(errorResponse, ErrorResponse.class);
                                    if (error.getMessage().equals("Email not found in the database.")) {
                                        showToast("Email not found.");
                                    } else {
                                        showToast("Error: " + error.getMessage());
                                    }
                                } catch (Exception e) {
                                    showToast("An error occurred.");
                                }
                            } else {
                                showToast("An error occurred.");
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        // Handle network failure or other errors
                        showToast("Network error occurred.");
                    }
                });
            }
            private void showToast(String message) {
                Toast.makeText(forget.this, message, Toast.LENGTH_SHORT).show();
            }

        });


    }

    class ErrorResponse {
        private String message;

        public String getMessage() {
            return message;
        }
    }

}