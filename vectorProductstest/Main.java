package vectorProductstest;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        Product [] vect = new Product[n];// Vetor do tipo referencia

        for (int i = 0;i < vect.length;i++){
            sc.nextLine();// Consumir quebra de linha pendente
            String name = sc.nextLine();// receber o nome do produto
            double price = sc.nextDouble();// receber o preço
            vect [i] = new Product(name,price); // instanciar um objeto no vetor
        }

        double sum = 0;
        for (int i = 0;i< vect.length;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/ vect.length;

        System.out.printf("AVERAGE PRICE: %.2f%n",avg);


        sc.close();
    }
}
