package com.desafiolatam.prueba4.network;

import com.desafiolatam.prueba4.models.Quote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIConnection {

    @POST("?cat=movies&count=10")
    Call<Quote[]> myCall(@Header("X-Mashape-Key") String mashapeKey);

}
