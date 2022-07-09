package com.jimcode.helmascot.Adaptador;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jimcode.helmascot.R;

public class MascotaViewHolder extends RecyclerView.ViewHolder {

    public ImageView ivFotoMascota;
    public TextView txvNombreMascota, txvDescripcionMascota, txvRazaMascota, txvFechaMascota;

    public MascotaViewHolder(@NonNull View itemView) {
        super(itemView);
        ivFotoMascota = itemView.findViewById(R.id.ivFotoMascota);
        txvNombreMascota = itemView.findViewById(R.id.txvNombreMascota);
        txvDescripcionMascota = itemView.findViewById(R.id.txvDescripcionMascota);
        txvRazaMascota = itemView.findViewById(R.id.txvRazaMascota);
        txvFechaMascota = itemView.findViewById(R.id.txvFechaMascota);
    }
}
