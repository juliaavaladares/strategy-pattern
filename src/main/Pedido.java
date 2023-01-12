package main;

public class Pedido {
    private float valorInicial;
    private int meses;
    
    public Pedido(float valorInicial, int meses) {
        this.valorInicial = valorInicial;
        this.meses = meses;
    }

    public float getvalorInicial() {
        return valorInicial;
    }

    public void setvalorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
}
