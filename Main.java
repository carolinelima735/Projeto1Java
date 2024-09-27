package br.com.Delivery;

public class Main {
    public static void main(String[] args) {
        
        String[] menu = {"Pizza", "Hambúrguer", "Salada"};
        RestauranteConcreto restaurante = new RestauranteConcreto("FastFood", "Rua Principal, 123", menu);

        restaurante.mostrarMenu();

        Cliente cliente = new Cliente("João", "4002-8922", "Qne, 2");

       
        Entregador entregador = new Entregador("Carlos", "1234-5678", "Moto");

    
        Prato prato = new Prato("Pizza", 30.0);

        Pedido pedido = new Pedido(cliente, entregador, prato);

        pedido.exibirDetalhes();

    
        pedido.entregarPedido();

        pedido.exibirDetalhes();
    }
}
 