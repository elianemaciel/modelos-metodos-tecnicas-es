package com.mycompany.exercicio_funcionarios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        ListaFuncionarios listagem = new ListaFuncionarios();
        Exclusao excluir = new Exclusao();
        
        int escolha = 0;
        
        while(escolha != 4){
        System.out.println("[1] para cadastrar um funcionario");
        System.out.println("[2] para exluir um funcionario");
        System.out.println("[3] para listar os funcionarios cadastrados");
        System.out.println("[4] para finalizar o programa");
        escolha = leitura.nextInt();

        switch (escolha) {
            case 1:
                cadastro.cadastroFuncionarios(listagem);
                break;
            case 2:
                excluir.excluirFuncionarios(listagem);
                break;
            case 3:
                listagem.exibirFuncionarios();
                break;
            case 4:
                System.out.println("Programa finalizado!");
                break;
        }   
        }
    }
}
