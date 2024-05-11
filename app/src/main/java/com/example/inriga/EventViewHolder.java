package com.example.inriga;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class EventViewHolder extends RecyclerView.ViewHolder {
    TextView EventName;
    TextView EventDescription;
    TextView EventDate;
    TextView EventTime;
    View view;

    EventViewHolder(View itemView)
    {
        super(itemView);

    }
}
