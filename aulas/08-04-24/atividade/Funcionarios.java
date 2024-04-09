package atividade;

public abstract class Funcionarios implements Funcionario {
    private String nome;
    private int id;

    public Funcionarios(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters
    
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }
}