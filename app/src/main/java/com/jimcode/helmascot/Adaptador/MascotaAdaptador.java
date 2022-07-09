package com.jimcode.helmascot.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jimcode.helmascot.R;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter {

    private ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout_item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mascota_item, viewGroup, false);
        MascotaViewHolder mascotaViewHolder = new MascotaViewHolder(layout_item);
        return mascotaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MascotaViewHolder mascotaViewHolder = (MascotaViewHolder) viewHolder;
        mascotaViewHolder.ivFotoMascota.setImageResource(mascotas.get(i).getFoto());
        mascotaViewHolder.txvNombreMascota.setText(mascotas.get(i).getNombre());
        mascotaViewHolder.txvDescripcionMascota.setText(mascotas.get(i).getDescripcion());
        mascotaViewHolder.txvRazaMascota.setText(mascotas.get(i).getRaza());
        mascotaViewHolder.txvFechaMascota.setText(mascotas.get(i).getFecha());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }
}
