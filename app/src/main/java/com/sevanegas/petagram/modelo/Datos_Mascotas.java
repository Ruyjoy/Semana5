package com.sevanegas.petagram.modelo;

public class Datos_Mascotas {

    private int id ;
    private String nombre_mascota;
    private int foto;
    int fav;
    private int likes;

    public Datos_Mascotas(String nombre_mascota, int foto) {
        this.nombre_mascota = nombre_mascota;
        this.foto = foto;
    }

    public Datos_Mascotas() {

    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getFoto() {
        return foto;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
