//package com.example.inriga;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//import com.example.inriga.EventData;
//import com.example.inriga.EventRecViewAdapter;
//import com.example.inriga.R;
//import java.util.ArrayList;
//import java.util.List;
//
//public class HomeActivity extends Fragment {
//
//    private RecyclerView recyclerView;
//    private EventRecViewAdapter adapter;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        recyclerView = view.findViewById(R.id.eventsRecyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
//        adapter = new EventRecViewAdapter(getData()); // Pass your event data to the adapter
//        recyclerView.setAdapter(adapter);
//        return view;
//    }
//
//    private List<EventData> getData() {
//        // Create and return sample event data
//        List<EventData> list = new ArrayList<>();
//        list.add(new EventData("Hokejs", "Latvija vs Kanāda", "01.02.2024", "18:00", "Riga"));
//        list.add(new EventData("Hokejs", "Latvija vs Kanāda", "01.02.2024", "18:00", "Riga"));
//        list.add(new EventData("Hokejs", "Latvija vs Kanāda", "01.02.2024", "18:00", "Riga"));
//        return list;
//    }
//}
