package com.example.bibliotecacrud.model;

public abstract class Exemplar {
    private String codigo;
    private boolean alugado;

    public Exemplar(String codigo, boolean alugado) {
        this.codigo = codigo;
        this.alugado = alugado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "codigo='" + codigo + '\'' +
                ", alugado=" + alugado +
                '}';
    }
}
