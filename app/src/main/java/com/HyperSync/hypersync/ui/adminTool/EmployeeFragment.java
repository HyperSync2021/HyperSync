package com.HyperSync.hypersync.ui.adminTool;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.HyperSync.hypersync.model.Worker;
import com.HyperSync.hypersync.R;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFragment extends Fragment {



    private Button addAnEmployeeBtn;
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employee, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        //recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // 3. create an adapter
        EmployeeRVAdapter mAdapter = new EmployeeRVAdapter(getContext(),employeeData());
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        addAnEmployeeBtn = view.findViewById(R.id.btnEmployee);


        return view;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        addAnEmployeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddEmptyDialogFragment fragment = new AddEmptyDialogFragment("Employee");
                fragment.show(getChildFragmentManager(), "dialog");
            }
        });
    }


    public List<Worker> employeeData(){
        ArrayList<Worker> currentEmployee = new ArrayList<>();

        return currentEmployee;
    }


}