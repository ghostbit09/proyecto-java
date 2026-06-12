package com.example.ejercicio1;

public class Producto implements Pagable, Serializable {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularPago() {
        return this.precio * (double)this.cantidad;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = calcularPago();
        return total - (total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format("Producto: %s | Precio: $%.2f | Cantidad: %d | Total con descuento: $%.2f", this.nombre, this.precio, this.cantidad, this.aplicarDescuento(10));
    }

    public String serializar() {
        return String.format("{Tipo: 'Producto', nombre: '%s', precio: %.2f, cantidad: %d, total: %.2f}", nombre, precio, cantidad, calcularPago());
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String toString() {
        return this.descripcion();
    }
}