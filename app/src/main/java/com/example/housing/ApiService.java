package com.example.housing;

import com.example.housing.models.Propertyform;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @POST("https://dev.cofastudio.com/demo/reallist.php/") // Replace with the actual PHP script name
    Call<Void> createProperty(@Body Propertyform property);

//    @GET("user/{uniqueId}")
//    Call<Propertyform> getPropertyWithUniqueId(@Path("uniqueId") String uniqueId);

}
