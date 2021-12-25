package com.HyperSync.hypersync.ui.adminTool;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;

import com.HyperSync.hypersync.Worker;
import com.HyperSync.hypersync.R;
import com.google.firebase.database.FirebaseDatabase;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AddEmptyDialogFragment extends DialogFragment {
    String worker;
    EditText Email,Id;
    FirebaseDatabase db;
    Button btn;

    public AddEmptyDialogFragment(String worker) {
        this.worker = worker;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_dialog, container, false);

        Email = view.findViewById(R.id.editText_username);
        Id = view.findViewById(R.id.editText_ID);
        btn = view.findViewById(R.id.BtnSubmit);


        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                String id = Id.getText().toString();
                String b64email = Base64.getEncoder().encodeToString(email.getBytes(StandardCharsets.UTF_8));

                Worker worker3 = new Worker(email,id,"ABCD",worker);

                db = FirebaseDatabase.getInstance();

                db.getReference("Emails").child(b64email).setValue(worker3);

                getDialog().dismiss();
            }
        });

        return view;
    }

}