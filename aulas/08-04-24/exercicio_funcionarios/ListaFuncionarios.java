package com.mycompany.exercicio_funcionarios;

import java.util.ArrayList;

public class ListaFuncionarios{

    ArrayList <Funcionarios> funcionarios = new ArrayList <Funcionarios>();

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public ListaFuncionarios() {
        funcionariosCadastrados();
    }
    
    
    
    public void adicionarFuncionarios(Funcionarios funcionario){
        funcionarios.add(funcionario);
    }
    
    public void funcionariosCadastrados(){
    funcionarios.add(new Funcionarios("João", 20.0, 40.0));
    funcionarios.add(new Funcionarios("Maria", 25.0, 35.0));
    }
    
    public void exibirFuncionarios(){
        for(Funcionarios funcionario : funcionarios){
        System.out.println("\nNOME: " + funcionario.getNome());
        System.out.println("VALOR DA HORA: " + funcionario.getValorHora());
        System.out.println("QUANTIDADE DE HORAS TRABALHADAS NO MÊS: " + funcionario.getHoras());
        System.out.println("SALARIO MENSAL: " + funcionario.salario());
        }
    }
    
    public void excluirFuncionario(Funcionarios funcionario) {
        funcionarios.remove(funcionario);
    }
}
