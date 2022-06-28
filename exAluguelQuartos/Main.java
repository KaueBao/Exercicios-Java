package exAluguelQuartos;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Quartos[] vect = new Quartos[10];

        int quartosAlugados;

        System.out.print("Quantos quartos serão alugados:");
        quartosAlugados = sc.nextInt();

        for (int i = 0; i < quartosAlugados; i++) {
            System.out.printf("Aluguel #%d%n", (i + 1));

            System.out.print("Nome:");
            String nome = sc.next();

            System.out.print("E-mail:");
            String email = sc.next();

            System.out.print("Numero do Quarto:");
            int numeroQuarto = sc.nextInt();
            System.out.println("");

            vect[numeroQuarto] = new Quartos(nome, email, numeroQuarto);
        }
        System.out.println("Quartos ocupados");

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] != null) {
                System.out.printf(vect[i].getNumQuarto() + ":" + vect[i].getName() + "," + vect[i].getEmail() + "%n");
            }

        }

        sc.close();
    }
}
