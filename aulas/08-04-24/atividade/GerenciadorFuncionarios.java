package atividade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorFuncionarios {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    // Adicionar funcionários à lista
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Excluir funcionários iterando pela lista e encontrando o funcionário com o id a ser removido
    public void excluirFuncionario(int id) {
        Iterator<Funcionario> iterator = funcionarios.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();
            if (funcionario.getId() == id) {
                iterator.remove();
            }
        }
    }

    // For each para imprimir todos os salários juntos
    public void imprimirSalarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprimirSalario();
        }
    }
}