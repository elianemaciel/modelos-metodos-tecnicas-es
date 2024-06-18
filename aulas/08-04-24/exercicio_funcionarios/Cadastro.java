package com.mycompany.exercicio_funcionarios;

import java.util.Scanner;

public class Cadastro{

    Scanner leitura = new Scanner(System.in);

    String nome;
    Double valorHora;
    Double horas;

    public Cadastro() {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horas = horas;
    }
    
    public void cadastroFuncionarios(ListaFuncionarios lista) {
        System.out.println("Digite o nome do funcionário:");
        nome = leitura.nextLine();
        System.out.println("Digite o valor da hora:");
        valorHora = leitura.nextDouble();
        System.out.println("Digite as horas trabalhadas:");
        horas = leitura.nextDouble();
        
        Funcionarios novoFuncionario = new Funcionarios(nome, valorHora, horas);
        lista.adicionarFuncionarios(novoFuncionario);
    }
}