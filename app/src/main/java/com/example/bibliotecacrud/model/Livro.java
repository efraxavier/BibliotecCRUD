package com.example.bibliotecacrud.model;

public class Livro extends Exemplar {
    private String ISBN;
    private String titulo;
    private String autor;

    public Livro(String codigo, boolean alugado, String ISBN, String titulo, String autor) {
        super(codigo, alugado);
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                "} " + super.toString();
    }
}
