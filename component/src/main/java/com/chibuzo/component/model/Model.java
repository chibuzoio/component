package com.chibuzo.component.model;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

public class Model {
    private Context context;
    private RecyclerView recyclerView;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }
}


