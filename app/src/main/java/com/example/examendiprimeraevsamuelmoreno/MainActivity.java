package com.example.examendiprimeraevsamuelmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.examendiprimeraevsamuelmoreno.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button botonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botonLogin = findViewById(R.id.botonLogin);
        botonLogin.setOnClickListener(this::lanzarHotels);
    }
    public void lanzarHotels(View view) {
        Intent intent = new Intent();
        intent.setClass(this, Hotels.class);
        startActivity(intent);
    }
}