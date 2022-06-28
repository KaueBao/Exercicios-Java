package exclass2_funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee empregado = new Employee();
        System.out.print("Name:");
        empregado.name = sc.nextLine();
        System.out.print("Gross Salary:");
        empregado.grossSalary = sc.nextDouble();
        System.out.print("Tax:");
        empregado.tax = sc.nextDouble();

        System.out.println();

        System.out.println(empregado);

        System.out.print("Which percentage to increase salary?");
        double acrescimo = sc.nextDouble();
        System.out.printf("Updated Data: %s, $ %.2f", empregado.name,empregado.increaseSalary(acrescimo));

        sc.close();
    }
}
