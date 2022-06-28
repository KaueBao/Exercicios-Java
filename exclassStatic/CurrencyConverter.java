package exclassStatic;

public class CurrencyConverter {
    public static final double IOF = 0.06;


    public static double valorCompra(double valorDolar, double quantidadeDolar){
        return (valorDolar * quantidadeDolar) + (valorDolar * quantidadeDolar * IOF);
    }
}
