package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.*;

public class FinanciamentoTest {

    @Test
    public void deveCalcularFinanciamentoItau(){
        Pedido pedido = new Pedido(50000, 20);
        CalculadoraFinanciamento calculadora = new CalculadoraFinanciamento(pedido);

        float totalFinanciamentoEsperado = (float) (pedido.getvalorInicial() * Math.pow((1 + 0.10), pedido.getMeses()));
        
        assertEquals(totalFinanciamentoEsperado, calculadora.calculaFinanciamentoItau()); 

    }

    @Test
    public void deveCalcularFinanciamentoSantander(){
        Pedido pedido = new Pedido(50000, 20);
        CalculadoraFinanciamento calculadora = new CalculadoraFinanciamento(pedido);

        float totalFinanciamentoEsperado = (float) (pedido.getvalorInicial() * Math.pow((1 + 0.12), pedido.getMeses()));
        
        assertEquals(totalFinanciamentoEsperado, calculadora.calculaFinanciamentoSantander()); 

    }
}
