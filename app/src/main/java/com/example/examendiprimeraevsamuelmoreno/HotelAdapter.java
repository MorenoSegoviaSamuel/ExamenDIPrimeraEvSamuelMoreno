package com.example.examendiprimeraevsamuelmoreno;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelViewHolder> {
    private List<Hoteles> hotelesList;

    private List<Integer> imageList;
    private List<String> titleList;
    private List<String> subtitleList;

    private final Context context;

//    public HotelAdapter(Context context, List<Hoteles> hotelesList) {
//        this.context = context;
//        this.hotelesList = hotelesList;
//    }
    public HotelAdapter(List<Integer> imageList, List<String> titleList, List<String> subtitleList, Context context){
        this.imageList = imageList;
        this.titleList = titleList;
        this.subtitleList = subtitleList;
        this.context = context;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new HotelViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        String name = titleList.get(position);
        int imageId = imageList.get(position);
        String localizacion = subtitleList.get(position);

        holder.nombre.setText(name);
        holder.localizacion.setText(localizacion);
        holder.imagen.setImageResource(imageId);

//        holder.boton.setOnClickListener(v -> Toast.makeText(context, name, Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return hotelesList != null ? hotelesList.size() : 0;
    }
}
