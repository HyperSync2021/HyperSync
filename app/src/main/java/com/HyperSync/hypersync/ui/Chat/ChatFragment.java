package com.HyperSync.hypersync.ui.Chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.HyperSync.hypersync.databinding.FragmentChatsBinding;
import com.HyperSync.hypersync.ui.Chat.Adapter.UsersAdapter;
import com.HyperSync.hypersync.ui.Chat.Models.Users;
import com.HyperSync.hypersync.ui.Chat.Models.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    public ChatFragment() {
        // Required empty public constructor

    }

    FragmentChatsBinding binding;
    ArrayList<Users> list = new ArrayList<Users>();
    FirebaseDatabase database;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentChatsBinding.inflate(inflater, container, false);

        database = FirebaseDatabase.getInstance();
        UsersAdapter adapter = new UsersAdapter(list,getContext());
        binding.ChatRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        Users user = new Users("a","a","a","A","A","A");

        database.getReference("Data").child("ABCDE").child("Employee").child("ggg").setValue(user);

        database.getReference("Data").child("ABCDEF").child("Employee").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                list.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Users users = dataSnapshot.getValue(Users.class);
                    users.setUserId(dataSnapshot.getKey());
                    list.add(users);
                }

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        return binding.getRoot();
    }
}