package com.example.ejercicio2;

public class Producto implements Pagable {

    private String nombre;
    private double precio;
    private int cantidad;


    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public double calcularTotal() {
        return precio * cantidad;
    }

    @Override
    public double aplicarDescuento(double pct) {
        return calcularTotal() * (1- pct);
    }
}
