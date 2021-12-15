package com.example.projek_uas_mobile_device;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class VerifikasiSigninActivity extends Fragment {
    private static EditText txtEmail, txtPass;

    public VerifikasiSigninActivityListener pengaturActivity;
    public interface VerifikasiSigninActivityListener{
        public void kirim(String email, String pass);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            pengaturActivity = (VerifikasiSigninActivityListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        pengaturActivity = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_verifikasi,container,false);

        txtEmail = (EditText) view.findViewById(R.id.editEmail);
        txtPass = (EditText) view.findViewById(R.id.editPass);
        final Button TombolLogin = (Button) view.findViewById(R.id.btnLogin);

        TombolLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pengaturActivity.kirim(txtEmail.getText().toString() ,txtPass.getText().toString());
            }
        });
        return view;
    }
}
