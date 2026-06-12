package com.example.ejercicio4;

public abstract class RecursoBibliografico {

    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public abstract String obtenerResumen();

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " año de publicacion: " + anioPublicacion;
    }
}

