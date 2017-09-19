package com.example.dell.myapplication2.Rest;

import com.example.dell.myapplication2.Models.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface{
    /**
     * /movie/popular is the api end point
     * @param apiKey is the your api key from the site(not compulsory)
     * */
    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies(@Query("api_key") String apiKey);
}
