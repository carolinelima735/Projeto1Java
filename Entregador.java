package br.com.Delivery;

class Entregador extends Pessoa { // Herança
    private String veiculo; // Encapsulamento

    public Entregador(String nome, String telefone, String veiculo) { 
        super(nome, telefone); // Herança
        this.veiculo = veiculo;
    }

    public String getVeiculo() { // Encapsulamento
        return veiculo;
    }

    public void setVeiculo(String veiculo) { // Encapsulamento
        this.veiculo = veiculo;
    }

    @Override
    public void exibirDados() { // Polimorfismo
        System.out.println("Entregador: " + getNome() + ", Telefone: " + getTelefone() + ", Veículo: " + getVeiculo());
    }
}
