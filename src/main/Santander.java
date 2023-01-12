package main;

public class Santander extends Banco implements CalculaFinanciamento{

    @Override
    public float getTaxaJuros(Pedido pedido) {
        return (float) (pedido.getvalorInicial() * Math.pow((1 + 0.12), pedido.getMeses()));
    }
    
}
