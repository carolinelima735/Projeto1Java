package br.com.Delivery;

abstract class Pessoa { // Abstração
    private String nome; // Encapsulamento
    private String telefone; // Encapsulamento

    public Pessoa(String nome, String telefone) { // Herança
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { // Encapsulamento
        return nome;
    }

    public void setNome(String nome) { // Encapsulamento
        this.nome = nome;
    }

    public String getTelefone() { // Encapsulamento
        return telefone;
    }

    public void setTelefone(String telefone) { // Encapsulamento
        this.telefone = telefone;
    }

    public abstract void exibirDados();// Abstração e Polimorfismo
} 	
