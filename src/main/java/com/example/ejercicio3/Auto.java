package com.example.ejercicio3;

public class Auto extends Vehiculo {
    private double consumoCombustible;

    public Auto(String marca, String modelo, int anio, double consumoCombustible) {
        super(marca, modelo, anio);
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumoCombustible;
    }

}

