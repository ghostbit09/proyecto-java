package com.example.ejercicio3;


public class Main {
    public static void main(String[] args) {

        Flota flota = new Flota();

        flota.AgregarVehiculo(new Auto("Hyundai", "Kona", 2025, 0.12));
        flota.AgregarVehiculo(new Moto("Yamaha", "FZ15", 2024, 0.08));
        flota.AgregarVehiculo(new AutoElectrico("Tesla", "Modelo 3", 2023, 0.05, 75, 80));

        Vehiculo vehiculoEconomico = flota.obtenerVehiculoEconomico(100);
        System.out.println("\n✅ Vehículo más económico:");
        System.out.println(vehiculoEconomico.toString());
    }
}
