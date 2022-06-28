package exfor;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                System.out.printf("divisao impossivel%n");
            } else {
                double divisao = a / b;
                System.out.printf("%.1f%n",divisao);
            }
        sc.close();
        }
    }
}
