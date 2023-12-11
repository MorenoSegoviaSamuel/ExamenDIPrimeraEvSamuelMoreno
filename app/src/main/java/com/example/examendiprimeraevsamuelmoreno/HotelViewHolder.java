package com.example.examendiprimeraevsamuelmoreno;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HotelViewHolder extends RecyclerView.ViewHolder {

    protected ImageView imagen;
    protected TextView nombre;
    protected TextView localizacion;
    protected ImageButton boton;
    public HotelViewHolder(@NonNull View itemView) {
        super(itemView);
        imagen = itemView.findViewById(R.id.imageView);
        nombre = itemView.findViewById(R.id.nombre);
        localizacion = itemView.findViewById(R.id.localizacion);
        boton = itemView.findViewById(R.id.lanzar);
    }
}
