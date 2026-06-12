package com.bibliografia.ejercicio3;

public abstract class RecursoBibliografico {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Metodo abstracto
    public abstract String obtenerResumen();
}
