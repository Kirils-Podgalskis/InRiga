package com.example.inriga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class EventRecViewAdapter extends RecyclerView.Adapter<EventViewHolder> {

    List<EventData> list
            = Collections.emptyList();

    Context context;
    View.OnClickListener listener;

    public EventRecViewAdapter(List<EventData> list,
                               Context context, View.OnClickListener listener)
    {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public EventViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

//    @NonNull
//    @Override
//    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
}
