package com.example.examendiprimeraevsamuelmoreno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

public class Hotels extends AppCompatActivity {

    private List<Hoteles> Hoteles;

    private final List<Integer> images = List.of(
            R.drawable.hotel1,
            R.drawable.hotel2,
            R.drawable.hotel3,
            R.drawable.hotel4,
            R.drawable.hotel5
    );

    private final List<String> names = List.of("Nombre1", "Nombre2", "Nombre3", "Nombre4", "Nombre5");
    private final List<String> localizacion = List.of("Localizacion1", "Localizacion2", "Localizacion3", "Localizacion4", "Localizacion5");
    private RecyclerView recyclerView;
    ImageButton botonLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

//        Hoteles = new ArrayList<>();
//        Hoteles.add(new Hoteles(R.drawable.hotel1, "Name1","Localizacion1"));
//        Hoteles.add(new Hoteles(R.drawable.hotel2, "name2","localizacion2"));
//        Hoteles.add(new Hoteles(R.drawable.hotel3, "name3","localizacion3"));
//        Hoteles.add(new Hoteles(R.drawable.hotel4, "name4","localizacion4"));
//        Hoteles.add(new Hoteles(R.drawable.hotel5, "name5","localizacion5"));


        botonLanzar = findViewById(R.id.lanzar);
        botonLanzar.setOnClickListener(this::lanzarVisited);

     recyclerView = findViewById(R.id.recycler);
       HotelAdapter adapter = new HotelAdapter(images,names, localizacion,this);
      recyclerView.setLayoutManager(new LinearLayoutManager(this));
     recyclerView.setAdapter(adapter);

    }
    public void lanzarVisited(View view) {
        Intent intent = new Intent();
        intent.setClass(this, Visited.class);
        startActivity(intent);

    }
}