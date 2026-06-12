package com.example.ejercicio3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract double calcularCostoViaje(double distancia);

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anio + ")";
    }
}
