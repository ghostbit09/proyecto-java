package com.example.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> flota = new ArrayList<>();

    public void AgregarVehiculo(Vehiculo v) {
        flota.add(v);
    }

    public Vehiculo obtenerVehiculoEconomico(int distancia) {
        Vehiculo mejor = null;
        double menorCosto = Double.MAX_VALUE;

        for (Vehiculo v : this.flota) {
            double costo = v.calcularCostoViaje(distancia);
            System.out.println(v + " -> Costo: " + costo);
            if (costo < menorCosto) {
                menorCosto = costo;
                mejor = v;
            }
        }

        return mejor;
    }


}
