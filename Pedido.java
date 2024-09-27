package br.com.Delivery;

class Pedido {
    private Cliente cliente; // Encapsulamento
    private Entregador entregador; // Encapsulamento
    private Prato prato; // Encapsulamento
    private boolean entregue; // Encapsulamento

    public Pedido(Cliente cliente, Entregador entregador, Prato prato) { 
        // Construtor
        this.cliente = cliente;
        this.entregador = entregador;
        this.prato = prato;
        this.entregue = false;
    }

    public void entregarPedido() { 
        // Encapsulamento
        this.entregue = true;
        System.out.println("Pedido entregue ao cliente " + cliente.getNome() + " pelo entregador " + entregador.getNome());
    }

    public void exibirDetalhes() { 
        // Polimorfismo
        System.out.println("Detalhes do Pedido:");
        cliente.exibirDados(); // Polimorfismo
        entregador.exibirDados(); // Polimorfismo
        prato.exibirPrato(); 
        System.out.println("Status: " + (entregue ? "Entregue" : "Pendente"));
    }
}

