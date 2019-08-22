package com.example.homeactivity.networking;
import com.example.homeactivity.models.Category;
import com.example.homeactivity.models.ChangePassword;
import com.example.homeactivity.models.LoginModel;
import com.example.homeactivity.models.Product;
import com.example.homeactivity.models.RegisterModel;
import com.example.homeactivity.models.UsersModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface JsonPlaceHolderInterface {
    //    @FormUrlEncoded
    @GET("android/category")
    Call<List<Category>> getCategories();

    @GET("android/product")
    Call<List<Product>> getProducts();

    @POST("android/login/")
    Call<UsersModel> login(@Body LoginModel login);

    @POST("android/signup/")
    Call<UsersModel> register(@Body RegisterModel registerModel);
    @POST("rest_auth/password/change/")
    Call<UsersModel> changePassword(@Header("Authorization") String Token, @Body ChangePassword changePassword);
}