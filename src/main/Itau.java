package main;

public class Itau extends Banco implements CalculaFinanciamento {

    public Itau() {
    }

    @Override
    public float getTaxaJuros(Pedido pedido) {
        return (float) (pedido.getvalorInicial() * Math.pow((1 + 0.10), pedido.getMeses()));
    }
    
}
