package com.example.projek_uas_mobile_device;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    private PendidikanFragment objPendidikan;
    private KeahlianFragment objKeahlian;
    private PengalamanFragment objPengalaman;
    private Button btnPendidikan, btnKeahlian, btnPengalaman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        objPendidikan = new PendidikanFragment();
        objKeahlian = new KeahlianFragment();
        objPengalaman = new PengalamanFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flContainer, objPendidikan)
                .commit();

        btnPendidikan = (Button) findViewById(R.id.btnPendidikan);
        btnKeahlian = (Button) findViewById(R.id.btnKeahlian);
        btnPengalaman = (Button) findViewById(R.id.btnPengalaman);

        btnKeahlian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flContainer, objKeahlian)
                        .commit();
            }
        });
        btnPengalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flContainer, objPengalaman)
                        .commit();
            }
        });
        btnPendidikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flContainer, objPendidikan)
                        .commit();
            }
        });
    }
}