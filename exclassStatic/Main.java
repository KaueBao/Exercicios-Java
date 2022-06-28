package exclassStatic;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double precodolar,quantidade;

        System.out.print("What is the dollar price?");
        precodolar = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        quantidade = sc.nextDouble();

        System.out.print("Amount to be paid in reais = R$" + CurrencyConverter.valorCompra(precodolar,quantidade));


        sc.close();
    }
}
