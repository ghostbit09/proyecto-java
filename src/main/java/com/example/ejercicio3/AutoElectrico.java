package com.example.ejercicio3;

public class AutoElectrico extends Auto implements VehiculoElectrico {

    private double capacidadBateria;
    private double nivelCarga;
    private double costoPorKm;

    public AutoElectrico(String marca, String modelo, int anio, double costoPorKm, double capacidadBateria, double nivelCarga) {
        super(marca, modelo, anio, 0);
        this.costoPorKm = costoPorKm;
        this.capacidadBateria = capacidadBateria;
        this.nivelCarga = nivelCarga;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * costoPorKm;
    }

    @Override
    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    @Override
    public double getNivelCarga() {
        return nivelCarga;
    }

    @Override
    public String toString() {
        return super.toString() + " [Eléctrico]";
    }
}

