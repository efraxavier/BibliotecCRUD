package com.example.bibliotecacrud.model;

import java.time.LocalDate;

public class Aluguel {
    private Aluno aluno;
    private Exemplar exemplar;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucaoPrevista;

    public Aluguel(Aluno aluno, Exemplar exemplar, LocalDate dataAluguel, LocalDate dataDevolucaoPrevista) {
        this.aluno = aluno;
        this.exemplar = exemplar;
        this.dataAluguel = dataAluguel;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "aluno=" + aluno +
                ", exemplar=" + exemplar +
                ", dataAluguel=" + dataAluguel +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista +
                '}';
    }
}
