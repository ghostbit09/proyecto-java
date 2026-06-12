package com.example.ejercicio3;

public class Moto extends Vehiculo {
    private double consumo;

    public Moto(String marca, String modelo, int anio, double consumo) {
        super(marca, modelo, anio);
        this.consumo = consumo;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumo;
    }

}

