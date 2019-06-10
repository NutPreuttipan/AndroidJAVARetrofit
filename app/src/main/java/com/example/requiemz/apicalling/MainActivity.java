package com.example.requiemz.apicalling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gentle-oasis-71971.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

//        LoginModel loginModel = new LoginModel();
//        loginModel.setUsername("admin");
//        loginModel.setPassword("admin123");

        ProfileRequestModel profileRequestModel = new ProfileRequestModel();
        profileRequestModel.setName("Nuttarikan");


//        Call<apiResponseModel> call = apiInterface.login(loginModel);

        Call<ProfileResponseModel> call = apiInterface.profile(profileRequestModel);

        call.enqueue(new Callback<ProfileResponseModel>() {
            @Override
            public void onResponse(Call<ProfileResponseModel> call, Response<ProfileResponseModel> response) {

                if (!response.isSuccessful()) {
                    System.out.println("This is Not Success" + response);
                    return;
                }

                ProfileResponseModel profileResponseModel = response.body();

                for (ProfileData profileData : profileResponseModel.getData()) {
                    for (ProfileAddressDetail profileAddressDetail: profileData.getAddress().getHome()) {
                        System.out.println("API RESPONSE: " + profileAddressDetail.getAddress1());
                    }
                }
            }

            @Override
            public void onFailure(Call<ProfileResponseModel> call, Throwable t) {
                System.out.println("API CALL FAIL" + t);
            }
        });










        //        Call<List<Post>> call = apiInterface.getPosts();

//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//
//                if (!response.isSuccessful()) {
//                    System.out.println("This is Not Success" + response);
//                    return;
//                }
//
//                List<Post> data = response.body();
//                for (Post post : data) {
//                    System.out.println("This is response" + post.getId() + "\n");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                System.out.println("API CALL FAIL" + t);
//            }
//        });


    }
}
