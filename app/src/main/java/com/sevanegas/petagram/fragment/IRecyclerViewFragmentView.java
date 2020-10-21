package com.sevanegas.petagram.fragment;

import com.sevanegas.petagram.adapter.MascotaAdaptador;
import com.sevanegas.petagram.modelo.Datos_Mascotas;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Datos_Mascotas> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
