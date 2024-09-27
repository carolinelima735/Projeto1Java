package br.com.Delivery;

class RestauranteConcreto extends Restaurante { // Herança
    private String[] menu; // Encapsulamento
    public RestauranteConcreto(String nome, String endereco, String[] menu) { 
        // Construtor
        super(nome, endereco); 
        this.menu = menu;
    }

    @Override
    public void mostrarMenu() { 
        // Polimorfismo
        System.out.println("Menu do " + getNome() + ":");
        for (String item : menu) {
            System.out.println(item);
        }
    }
}
