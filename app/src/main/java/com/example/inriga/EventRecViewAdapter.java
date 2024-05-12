//package com.example.inriga;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class EventRecViewAdapter extends RecyclerView.Adapter<EventRecViewAdapter.ViewHolder> {
//
//    private List<EventData> events;
//
//    public EventRecViewAdapter(List<EventData> events) {
//        this.events = events;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        EventData event = events.get(position);
//        holder.eventName.setText(event.getName());
//        holder.eventDescription.setText(event.getDescription());
//        holder.eventDate.setText(event.getDate());
//        holder.eventTime.setText(event.getTime());
//        holder.eventLocation.setText(event.getLocation());
//    }
//
//    @Override
//    public int getItemCount() {
//        return events.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        TextView eventName;
//        TextView eventDescription;
//        TextView eventDate;
//        TextView eventTime;
//        TextView eventLocation;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            eventName = itemView.findViewById(R.id.eventName);
//            eventDescription = itemView.findViewById(R.id.eventDescription);
//            eventDate = itemView.findViewById(R.id.eventDate);
//            eventTime = itemView.findViewById(R.id.eventTime);
//            eventLocation = itemView.findViewById(R.id.eventLocation);
//        }
//    }
//
//
//}
