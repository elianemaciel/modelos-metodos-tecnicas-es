package com.mycompany.exercicio_funcionarios;

import java.util.Scanner;

public class Exclusao {

    Scanner leitura = new Scanner(System.in);
    
    public void excluirFuncionarios(ListaFuncionarios lista) {
        System.out.println("Digite o nome do funcionário que deseja excluir:");
        String nome = leitura.nextLine();
        boolean funcionarioEncontrado = false;
        for (Funcionarios funcionario : lista.getFuncionarios()) {
            if (funcionario.getNome().equals(nome)) {
                lista.excluirFuncionario(funcionario);
                funcionarioEncontrado = true;
                break;
            }
        }
        if (!funcionarioEncontrado) {
            System.out.println("Funcionário não encontrado.");
        } else {
            System.out.println("Funcionário " + nome + " excluído.");
        }
    }
}
