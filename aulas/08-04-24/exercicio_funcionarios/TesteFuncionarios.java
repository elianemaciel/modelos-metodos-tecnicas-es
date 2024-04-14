/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_funcionarios;

/**
 *
 * @author vm040
 */
public class TesteFuncionarios {
    public static void main(String[] args) {
        // Criação de um objeto Funcionarios
        Funcionarios funcionario = new Funcionarios("João", 20.0, 40.0);
        
        // Teste dos métodos get
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Valor da hora: " + funcionario.getValorHora());
        System.out.println("Horas trabalhadas: " + funcionario.getHoras());
        System.out.println("Salário mensal: " + funcionario.salario());
    }
}