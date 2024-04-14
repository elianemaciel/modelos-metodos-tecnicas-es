package com.mycompany.exercicio_funcionarios;


public class Funcionarios{
    
    private String nome;
    private Double valorHora;
    private Double horas;

    public String getNome() {
        return nome;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Double getHoras() {
        return horas;
    }

    public Funcionarios(String nome, Double valorHora, Double horas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Double salario(){
        Double salario = valorHora * horas;
        return salario;
    }
}