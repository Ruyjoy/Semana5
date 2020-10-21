package com.sevanegas.petagram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sevanegas.petagram.modelo.Datos_Mascotas;
import com.sevanegas.petagram.R;
import com.sevanegas.petagram.adapter.MascotaAdaptador;
import com.sevanegas.petagram.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment implements  IRecyclerViewFragmentView  {

    private ArrayList<Datos_Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    private RecyclerViewFragmentPresenter presenter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);
        ListaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }

    public void inicializaAdaptador (){


    }

    public void inicializarListaMascotas () {

        mascotas = new ArrayList<Datos_Mascotas>();
        mascotas.add(new Datos_Mascotas("Pep",R.drawable.perro_1));
        mascotas.add(new Datos_Mascotas("Tira",R.drawable.perro_2));
        mascotas.add(new Datos_Mascotas("Dare",R.drawable.perro_3));
        mascotas.add(new Datos_Mascotas("persha",R.drawable.perro_4));
        mascotas.add(new Datos_Mascotas("Marcos",R.drawable.perro_5));
        mascotas.add(new Datos_Mascotas("Flash",R.drawable.perro_6));
        mascotas.add(new Datos_Mascotas("Mari",R.drawable.perro_7));
        mascotas.add(new Datos_Mascotas("Sol",R.drawable.perro_8));
        mascotas.add(new Datos_Mascotas("Martina",R.drawable.perro_9));
        mascotas.add(new Datos_Mascotas("Tarcan",R.drawable.perro_10));

    }


    @Override
    public void generarLinearLayoutVertical() {

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Datos_Mascotas> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        ListaMascotas.setAdapter(adaptador);

    }
}
