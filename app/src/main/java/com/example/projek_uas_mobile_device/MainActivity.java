package com.example.projek_uas_mobile_device;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements VerifikasiSigninActivity.VerifikasiSigninActivityListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void kirim(String email, String pass) {
        Intent periksaLogin = new Intent(this,ProfileActivity.class);

        TextView keluaran = (TextView) findViewById(R.id.tvOutput1);

        if(email.equals("yogaagle321z@gmail.com")){
            if(pass.equals("200205")){
                startActivity(periksaLogin);
            }else {
                keluaran.setText("Password tidak sesuai");
            }
        }else {
            keluaran.setText("Email tidak ditemukan");
        }
    }
}