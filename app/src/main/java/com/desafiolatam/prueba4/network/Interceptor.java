package com.desafiolatam.prueba4.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Interceptor {

    private static final String BASE_URL = "https://andruxnet-random-famous-quotes.p.mashape.com/";

    public APIConnection getConnection(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        return retrofit.create(APIConnection.class);

    }

}
