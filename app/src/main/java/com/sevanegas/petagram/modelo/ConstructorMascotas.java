package com.sevanegas.petagram.modelo;

import android.content.ContentValues;
import android.content.Context;

import com.sevanegas.petagram.R;
import com.sevanegas.petagram.db.BaseDatos;
import com.sevanegas.petagram.db.ConstantesBaseDatos;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    private ArrayList<Datos_Mascotas> mascotas;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Datos_Mascotas> obtenerDatos(){


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

       /* ArrayList<Datos_Mascotas> mascotas = new ArrayList<>();
        mascotas.add(new Datos_Mascotas());
        mascotas.add(new Mascota(R.drawable.superdog2,"Falco",20));
        mascotas.add(new Mascota(R.drawable.superdog3,"Mastin",10));
        mascotas.add(new Mascota(R.drawable.supercat1,"Merlin",15));
        mascotas.add(new Mascota(R.drawable.supercat2,"Tren",0));


        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        //return db.obtenerTodasMacotas();*/
        return mascotas;


    }

    public void insertarTresMascotas(BaseDatos db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE,"Facha");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.dog1);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE,"Facha");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.dog1);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE,"Facha");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.dog1);

        db.insertarMascota(contentValues);
    }

    public void darLikeMascota (Datos_Mascotas mascota) {
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_LIKES_MASCOTAS_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLA_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
        db.insertarLikesMascota(contentValues);
    }

    public int obtenerLikesMascota (Datos_Mascotas mascota) {
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascotas(mascota);
    }
}
