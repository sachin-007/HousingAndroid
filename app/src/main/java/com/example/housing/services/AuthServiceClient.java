package com.example.housing.services;

import com.example.housing.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

public class AuthServiceClient {

    private static Retrofit retrofit;
//    private static final String BASE_URL = "https://dev.cofastudio.com/demo/reallist.php/";
//
//    public static ApiService.AuthService getAuthService() {
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit.create(ApiService.AuthService.class);
//    }
//
//    public interface AuthService {
//        @POST("authenticate") // Replace with the actual endpoint for authentication
//        Call<ResponseBody> authenticateUser(@Body RequestBody requestBody);
//    }

}
