package com.example.housing;

import com.example.housing.models.Propertyform;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

//public interface ApiService {
//        @POST("http://localhost/reallist/uuidreallist.php/") // Replace with the actual PHP script name
//        Call<Void> createProperty(@Body Propertyform property);
//
////    @GET("user/{uniqueId}")
////    Call<Propertyform> getPropertyWithUniqueId(@Path("uniqueId") String uniqueId);
//
//}

//import com.example.housing.models.Propertyform;
//import retrofit2.Call;
//import retrofit2.http.Body;
//import retrofit2.http.POST;
//
//public interface ApiService {
//        @POST("your-api-endpoint") // Replace with the actual API endpoint
//        Call<Void> createProperty(@Body Propertyform property);
//}

public interface ApiService {
        @POST("https://dev.cofastudio.com/demo/reallist.php/adduser/") // Replace with the actual PHP script name
        Call<Void> createProperty(@Body Propertyform property);
//
////    @GET("user/{uniqueId}")
////    Call<Propertyform> getPropertyWithUniqueId(@Path("uniqueId") String uniqueId);
//
//
//        public interface UserService {
//                @POST("https://dev.cofastudio.com/demo/reallist.php/add-user/")
//                Call<Void> addUser(@Body Propertyform property);
//        }
//
////        public interface AuthService {
////                @POST("")
////                Call<Void> authenticate(@Body Propertyform property);
////        }
//
//        @POST("https://dev.cofastudio.com/demo/reallist.php/add-user/") // Replace with the actual endpoint for authentication
//        Call<UserResponse> authenticateUser(@Body LoginRequest loginRequest);
//


        @POST("https://dev.cofastudio.com/demo/reallist.php/authenticate/")
        Call<UserResponse> authenticateUser(@Body LoginRequest loginRequest);

        @POST("https://dev.cofastudio.com/demo/reallist.php/forget/")
        Call<ResponseBody> forgetPassword(@Body ForgetPasswordRequest request);

}
