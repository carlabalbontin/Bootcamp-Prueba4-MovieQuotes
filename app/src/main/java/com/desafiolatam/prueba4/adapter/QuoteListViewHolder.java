package com.desafiolatam.prueba4.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.desafiolatam.prueba4.R;

public class QuoteListViewHolder extends RecyclerView.ViewHolder {

    public TextView quoteTv, authorTv;

    public QuoteListViewHolder(@NonNull View itemView) {
        super(itemView);

        quoteTv = itemView.findViewById(R.id.quoteTv);
        authorTv = itemView.findViewById(R.id.authorTv);
    }
}
