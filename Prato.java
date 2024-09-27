package br.com.Delivery;

class Prato {
    private String nome; // Encapsulamento
    private double preco; // Encapsulamento

    public Prato(String nome, double preco) { 
        // Construtor 
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { 
        // Encapsulamento
        return nome;
    }

    public void setNome(String nome) { 
        // Encapsulamento
        this.nome = nome;
    }

    public double getPreco() { 
        // Encapsulamento
        return preco;
    }

    public void setPreco(double preco) { 
        // Encapsulamento
        this.preco = preco;
    }

    public void exibirPrato() { 
        
        System.out.println("Prato: " + nome + ", Preço: R$ " + preco);
    }
}
