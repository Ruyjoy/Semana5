package com.sevanegas.petagram.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.sevanegas.petagram.modelo.Datos_Mascotas;
import com.sevanegas.petagram.R;
import com.sevanegas.petagram.adapter.MascotaAdaptador;

import java.util.ArrayList;


public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private ArrayList<Datos_Mascotas> mascotas;
    private RecyclerView listaMascotas;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank, container, false);



        View v = inflater.inflate(R.layout.fragment_blank,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvPerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(glm);

        iniciarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas(){

        mascotas = new ArrayList<Datos_Mascotas>();

        mascotas.add(new Datos_Mascotas("Pep",R.drawable.perro11));
        mascotas.add(new Datos_Mascotas("Pep",R.drawable.perro11));
        mascotas.add(new Datos_Mascotas("Pep",R.drawable.perro11));
        mascotas.add(new Datos_Mascotas("Pep",R.drawable.perro11));
        mascotas.add(new Datos_Mascotas("Pep",R.drawable.perro11));
    }
}