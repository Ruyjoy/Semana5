package com.sevanegas.petagram.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sevanegas.petagram.R;
import com.sevanegas.petagram.modelo.Datos_Mascotas;


import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotasViewHolder> {
    ArrayList<Datos_Mascotas> mascotas;
    Activity activity;

    public PerfilAdaptador(ArrayList<Datos_Mascotas> mascotas, Activity activity){

        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaAdaptador.MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //Darle vida a nuestro Layaout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank, parent, false);
        return new MascotaAdaptador.MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaAdaptador.MascotasViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
