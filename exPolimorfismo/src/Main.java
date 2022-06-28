import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();

        for (int i = 1; i <= numberTaxPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c): ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            switch (Character.toUpperCase(ch)) {
                case 'I' -> {
                    System.out.print("Anual income: ");
                    Double anualIncome = sc.nextDouble();

                    System.out.print("Health expenditures: ");
                    Double healthExpends = sc.nextDouble();

                    list.add(new Individual(name, anualIncome, healthExpends)); // adiciona o objeto diretamente na lista

                }
                case 'C' -> {
                    System.out.print("Anual income: ");
                    Double anualIncome = sc.nextDouble();

                    System.out.print("Employees: ");
                    int employees = sc.nextInt();

                    list.add(new Company(name, anualIncome, employees));
                }
            }


        }

        System.out.println("TAXES PAID:");

        for (TaxPayer t : list) {
            System.out.println(t.getName() + ": " + "$ " + String.format("%.2f", t.tax()));
        }

        double soma = 0;
        for (TaxPayer sum : list) {
            soma += sum.tax();
        }
        System.out.println("Total Paid: $ " + String.format("%.2f", soma));


        sc.close();
    }
}
