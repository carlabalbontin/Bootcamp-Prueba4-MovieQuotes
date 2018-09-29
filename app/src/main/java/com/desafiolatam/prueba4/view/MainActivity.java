package com.desafiolatam.prueba4.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.desafiolatam.prueba4.R;
import com.desafiolatam.prueba4.adapter.QuoteListAdapter;
import com.desafiolatam.prueba4.data.MyQuery;
import com.desafiolatam.prueba4.models.Quote;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.quotesRV);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        new BackgroundTask().execute("iiNQ9VEQiamshocO4YEtGc6sP9jCp1tdFX5jsnn6TdiotTm2dQ");
    }

    private class BackgroundTask extends MyQuery {

        @Override
        protected void onPostExecute(Quote[] quotes) {
            //Quote[] quoteList = new Gson().fromJson(quotes, Quote[].class);
            QuoteListAdapter adapter = new QuoteListAdapter(quotes);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
            Log.d("QUOTE", String.valueOf(quotes.length));
        }

    }
}
