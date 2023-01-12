package main; 


public class CalculadoraFinanciamento{
    private Pedido pedido;
   
    
    public CalculadoraFinanciamento(Pedido pedido) {
        this.pedido = pedido;
    }

    public float calculaFinanciamentoItau(){
        Itau itau = new Itau();
        return itau.getTaxaJuros(pedido);
    }

    public float calculaFinanciamentoSantander(){
        Santander santander = new Santander();
        return santander.getTaxaJuros(pedido);
    }

}