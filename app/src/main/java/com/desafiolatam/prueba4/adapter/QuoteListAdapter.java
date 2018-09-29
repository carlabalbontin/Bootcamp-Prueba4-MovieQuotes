package com.desafiolatam.prueba4.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.desafiolatam.prueba4.R;
import com.desafiolatam.prueba4.models.Quote;

public class QuoteListAdapter extends RecyclerView.Adapter<QuoteListViewHolder> {

    private Quote[] quotes;

    public QuoteListAdapter(Quote[] quotes) {
        this.quotes = quotes;
    }

    @NonNull
    @Override
    public QuoteListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_quote, viewGroup, false);
        return new QuoteListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteListViewHolder quoteListViewHolder, int i) {
        String quote = quotes[i].getQuote();
        String author = quotes[i].getAuthor();

        quoteListViewHolder.quoteTv.setText(quote);
        quoteListViewHolder.authorTv.setText(author);

    }

    @Override
    public int getItemCount() {
        return quotes.length;
    }
}
