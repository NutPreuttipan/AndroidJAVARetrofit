package com.example.requiemz.apicalling;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("posts")
    Call<List<Post>> getPosts();

    @POST("login")
    Call<apiResponseModel> login(@Body LoginModel loginModel);

    @POST("profile")
    Call<ProfileResponseModel> profile(@Body ProfileRequestModel profileRequestModel);
}
