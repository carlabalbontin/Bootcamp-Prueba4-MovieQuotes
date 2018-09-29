package com.desafiolatam.prueba4.data;

import android.os.AsyncTask;

import com.desafiolatam.prueba4.models.Quote;
import com.desafiolatam.prueba4.network.APIConnection;
import com.desafiolatam.prueba4.network.Interceptor;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class MyQuery extends AsyncTask<String, Void, Quote[]> {

    @Override
    protected Quote[] doInBackground(String... strings) {

        APIConnection connection = new Interceptor().getConnection();
        Call<Quote[]> call = connection.myCall(strings[0]);

        try {
            Response<Quote[]> response = call.execute();
            if(200 == response.code() && response.isSuccessful()){
                return response.body();
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
