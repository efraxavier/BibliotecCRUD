package com.example.bibliotecacrud.model;

import java.time.LocalDate;

public class Aluno {
    private int RA;
    private String nome;
    private String curso;
    private LocalDate dataIngresso;

    public Aluno(int RA, String nome, String curso, LocalDate dataIngresso) {
        this.RA = RA;
        this.nome = nome;
        this.curso = curso;
        this.dataIngresso = dataIngresso;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RA=" + RA +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", dataIngresso=" + dataIngresso +
                '}';
    }
}
