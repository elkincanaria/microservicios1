package com.bibliografia.ejercicio3;

public class LibroElectronico extends RecursoDigital {
    private int numeroPaginas;
    private boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion,
                            String formato, double tamanioMB,
                            int numeroPaginas, boolean tieneDRM) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isTieneDRM() {
        return tieneDRM;
    }

    @Override
    public String obtenerResumen() {
        return super.obtenerResumen() +
                ", Páginas: " + numeroPaginas +
                ", DRM: " + (tieneDRM ? "Sí" : "No");
    }
}
