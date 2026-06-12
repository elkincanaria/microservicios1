package com.bibliografia.ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<RecursoBibliografico> recursos = new ArrayList<>();

        recursos.add(new LibroElectronico("Libro A", "Autor 1", 2005, "PDF", 5.2, 300, true));
        recursos.add(new LibroElectronico("Libro B", "Autor 2", 1998, "EPUB", 3.1, 250, false));
        recursos.add(new LibroElectronico("Libro C", "Autor 3", 2010, "PDF", 4.0, 200, true));
        recursos.add(new RecursoDigital("Informe", "Autor 4", 1900, "PDF", 1.1));

        System.out.println("=== Resúmenes ===");
        for (RecursoBibliografico r : recursos) {
            System.out.println(r.obtenerResumen());
        }

        // Buscar el libro más antiguo
        LibroElectronico masAntiguo = null;

        for (RecursoBibliografico r : recursos) {
            if (r instanceof LibroElectronico) {
                LibroElectronico libro = (LibroElectronico) r;

                if (masAntiguo == null ||
                        libro.getAnioPublicacion() < masAntiguo.getAnioPublicacion()) {
                    masAntiguo = libro;
                }
            }
        }

        System.out.println("\n=== Libro más antiguo ===");
        if (masAntiguo != null) {
            System.out.println(masAntiguo.obtenerResumen());
        }
    }
}
