import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            double horasTrabalhadas, valorPorHora;
            int numero;
        System.out.print("Entre com o numero do funcionario:");
            numero = sc.nextInt();
            sc.nextLine();
        System.out.print("Entre com o valor que ele recebe por hora:");
            valorPorHora = sc.nextDouble();
            sc.nextLine();
        System.out.print("Entre com a quantidade de horas trabalhadas:");
            horasTrabalhadas = sc.nextDouble();
            double salario = horasTrabalhadas * valorPorHora;
        System.out.printf("O funcionario de numero (%d) receberá R$ %.2f", numero, salario);
    }
}
