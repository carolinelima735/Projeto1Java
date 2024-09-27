package br.com.Delivery;

abstract class Restaurante { // Abstração
    private String nome; // Encapsulamento
    private String endereco; // Encapsulamento

    public Restaurante(String nome, String endereco) { 
        // Construtor 
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract void mostrarMenu(); // Abstração e Polimorfismo

    public String getNome() { 
        // Encapsulamento
        return nome;
    }

    public void setNome(String nome) { 
        // Encapsulamento
        this.nome = nome;
    }

    public String getEndereco() { 
        // Encapsulamento
        return endereco;
    }

    public void setEndereco(String endereco) { 
        // Encapsulamento
        this.endereco = endereco;
    }
}
