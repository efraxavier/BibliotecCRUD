package com.example.bibliotecacrud.model;

public class Revista extends Exemplar {
    private String ISSN;
    private String titulo;

    public Revista(String codigo, boolean alugado, String ISSN, String titulo) {
        super(codigo, alugado);
        this.ISSN = ISSN;
        this.titulo = titulo;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "ISSN='" + ISSN + '\'' +
                ", titulo='" + titulo + '\'' +
                "} " + super.toString();
    }
}
