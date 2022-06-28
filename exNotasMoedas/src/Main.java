import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N;
        int moeda50, moeda25, moeda10, moeda5, moeda1Centavo;
        int nota10, nota100, nota50, nota20, nota5, nota2;
        int moeda1;


        N = sc.nextDouble();
        nota100 = (int) (N / 100);
        nota50 = (int) (N % 100 / 50);
        nota20 = (int) (N % 100 % 50 / 20);
        nota10 = (int) (N % 100 % 50 % 20 / 10);
        nota5 = (int) (N % 100 % 50 % 20 % 10 / 5);
        nota2 = (int) (N % 100 % 50 % 20 % 10 % 5 / 2);


        moeda1 = (int) (N % 100 % 50 % 2000 % 10 % 5 % 2);
        moeda50 = (int) (N * 100 % 10000 % 50000 % 2000 % 1000 % 5000 % 100 / 50);
        moeda25 = (int) (N * 100 % 10000 % 50000 % 2000 % 1000 % 5000 % 100 % 50 / 25);
        moeda10 = (int) (N * 100 % 10000 % 50000 % 2000 % 1000 % 5000 % 100 % 50 % 25 / 10);
        moeda5 = (int) (N * 100 % 10000 % 50000 % 2000 % 1000 % 5000 % 100 % 50 % 25 % 10 / 5);
        moeda1Centavo = (int) (N * 100 % 10000 % 50000 % 2000 % 1000 % 5000 % 100 % 50 % 25 % 10 % 5);

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1Centavo + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
