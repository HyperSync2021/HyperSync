package com.HyperSync.hypersync.ui.project;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.HyperSync.hypersync.R;

import java.util.ArrayList;
import java.util.List;

public class ProjectFragment extends Fragment {




    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        //recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // 3. create an adapter
        ProjectRVadapter mAdapter = new ProjectRVadapter(getContext(),employeeData());
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        return view;


    }


    public List<projectData> employeeData(){
        ArrayList<projectData> currentProjectData = new ArrayList<>();
        currentProjectData.add(new projectData("yashchandil20@gmail.com"));
        currentProjectData.add(new projectData("jay@gmail.com"));
        currentProjectData.add(new projectData("jenish@gmail.com"));
        currentProjectData.add(new projectData("rajat@gmail.com"));
        currentProjectData.add(new projectData("aditya@gmail.com"));


        return currentProjectData;
    }


}