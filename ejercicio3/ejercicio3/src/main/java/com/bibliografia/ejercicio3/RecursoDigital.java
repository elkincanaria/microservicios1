package com.bibliografia.ejercicio3;

public class RecursoDigital extends RecursoBibliografico {
    protected String formato;
    protected double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion,
                          String formato, double tamanioMB) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    public String getFormato() {
        return formato;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    @Override
    public String obtenerResumen() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Año: " + anioPublicacion +
                ", Formato: " + formato +
                ", Tamaño: " + tamanioMB + "MB";
    }
}
