package atividade;

/* 
import atividade.
*/ 

public class Main {
    public static void main(String[] args) {
        // Obj para gerenciar os funcionários(adicionar, remover e listar)
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        // O objeto de criação de um Funcionário-Hora recebe ([String] Nome, [int] ID, [double] Salário-hora, [int] Horas Trabalhadas)
        gerenciador.adicionarFuncionario(new FuncionarioHora("Kleber", 1, 13.5, 140)); 
        gerenciador.adicionarFuncionario(new FuncionarioHora("Julio", 3, 11, 105));
        gerenciador.adicionarFuncionario(new FuncionarioHora("Davi", 5, 5.5, 120)); 
        gerenciador.adicionarFuncionario(new FuncionarioHora("NaoVagabundo", 7, 27.5, 220)); 

        // O objeto de criação de um Funcionário-Assalariado recebe ([String] Nome, [int] ID, [double] Salário-mês)
        gerenciador.adicionarFuncionario(new FuncionarioAssalariado("Maria", 2, 5400));
        gerenciador.adicionarFuncionario(new FuncionarioAssalariado("João", 4, 2000));
        gerenciador.adicionarFuncionario(new FuncionarioAssalariado("Marcos", 6, 3200));
        gerenciador.adicionarFuncionario(new FuncionarioAssalariado("Nicolas", 8, 1240));

        // Excluindo funcionários
        gerenciador.excluirFuncionario(1);
        gerenciador.excluirFuncionario(2);

        // Calculando e exibindo o salário dos funcionários
        gerenciador.imprimirSalarios();
    }
}