package exfor;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double a, b, c;


        for (int i = 0; i < N; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.printf("%.1f%n", media);
        }
        sc.close();

    }
}
