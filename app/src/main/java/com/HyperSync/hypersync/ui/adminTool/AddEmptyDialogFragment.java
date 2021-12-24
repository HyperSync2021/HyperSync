package com.HyperSync.hypersync.ui.adminTool;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.HyperSync.hypersync.R;
import com.google.firebase.database.FirebaseDatabase;

public class AddEmptyDialogFragment extends DialogFragment {
    boolean worker;
    EditText Email,Id;
    FirebaseDatabase db;
    Button btn;

public AddEmptyDialogFragment(boolean worker) {
    this.worker = worker;
}
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext())
                .setView(R.layout.layout_dialog)
//                .setPositiveButton(, (dialog, which) -> {} )
                .create();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.layout_dialog,
                container, false);
        btn = (Button) view.findViewById(R.id.BtnSubmit);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
//                Email = getView().findViewById(R.id.editText_username);
//                Id = getView().findViewById(R.id.editText_ID);
//
//                String email = Email.getText().toString();
//                String id = Id.getText().toString();
//
//                WorkersData workerdata = new WorkersData(email,id,worker,"ABCDE");
//
//                db = FirebaseDatabase.getInstance();
//
//                db.getReference("Emails").setValue(workerdata);
            }
        });
        return view;

    }
}