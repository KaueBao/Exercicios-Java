package exBanco;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numAccount;
        String name;


        System.out.print("Enter account number: ");
        numAccount = sc.nextInt();


        System.out.print("Enter account holder: ");
        name = sc.next();


        Banco banco = new Banco(numAccount, name);


        System.out.print("Is there a initial deposit?(y/n) ");
        String resposta = sc.next();

        if (resposta.toLowerCase().charAt(0) == 'y') {
            System.out.print("Enter initial deposit value:");
            banco.depositFunction(sc.nextDouble()); // receber o valor para deposito
            banco.updateData();
        }

        boolean a = true;
        while (a) {

            System.out.print("1.Deposit / 2.Withdraw / 3.Exit");
            String opcao = sc.next();

            switch (opcao.charAt(0)) {
                case '1':
                    System.out.print("Enter a deposit value:");
                    banco.depositFunction(sc.nextDouble());
                    banco.updateData();
                    break;
                case '2':
                    System.out.print("Enter a withdraw value:");
                    banco.withdrawFunction(sc.nextDouble());
                    banco.updateData();
                    break;
                case '3':
                    a = false;
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }


    }
}
