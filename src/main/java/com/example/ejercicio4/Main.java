package com.example.ejercicio4;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<RecursoBibliografico> biblioteca = new ArrayList<>();

        biblioteca.add(new LibroElectronico("Java Basico", "Autor A", 2015, "PDF", 5.2, 200, true));
        biblioteca.add(new LibroElectronico("Aprende sobre Python", "Autor B", 2010, "ePub", 3.8, 350, false));
        biblioteca.add(new LibroElectronico("Estructuras de Datos", "Autor C", 2018, "PDF", 6.1, 500, true));

        // Mostrar resumenes
        System.out.println("Resumenes");
        for (RecursoBibliografico r : biblioteca) {
            System.out.println(r.obtenerResumen());
        }

        // Búsqueda del libro más antiguo
        RecursoBibliografico masAntiguo = null;

        for (RecursoBibliografico r : biblioteca) {
            if (masAntiguo == null || r.getAnioPublicacion() < masAntiguo.getAnioPublicacion()) {
                masAntiguo = r;
            }
        }

        System.out.println("Libro más antiguo:");
        System.out.println(masAntiguo);
    }
}

