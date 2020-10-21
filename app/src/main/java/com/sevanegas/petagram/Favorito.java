package com.sevanegas.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sevanegas.petagram.adapter.MascotaAdaptador;
import com.sevanegas.petagram.modelo.Datos_Mascotas;

import java.util.ArrayList;

public class Favorito extends AppCompatActivity {

    ArrayList<Datos_Mascotas> mas;
    private RecyclerView LisMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorito);

        Toolbar ActionBar = findViewById(R.id.actionbar);
        setSupportActionBar(ActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        LisMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llam = new LinearLayoutManager(this);
        llam.setOrientation(LinearLayoutManager.VERTICAL);

        LisMascotas.setLayoutManager(llam);
        iniListaMascotas();
        iniAdaptador();

    }

    public void iniAdaptador (){
        MascotaAdaptador adaptador = new MascotaAdaptador(mas);
        LisMascotas.setAdapter(adaptador);
    }

    public void iniListaMascotas () {

        mas = new ArrayList<Datos_Mascotas>();
        mas.add(new Datos_Mascotas("Tarcan",R.drawable.perro_10));
        mas.add(new Datos_Mascotas("Mia",R.drawable.perro_7));
        mas.add(new Datos_Mascotas("Dante",R.drawable.perro_4));
        mas.add(new Datos_Mascotas("Lucas",R.drawable.perro_5));
        mas.add(new Datos_Mascotas("Kira",R.drawable.perro_2));

    }


}