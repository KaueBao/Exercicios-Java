package exclass1_rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle retangulo = new Rectangle();
        System.out.println("Entre com a Altura e Largura do retangulo");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.areaRectangle());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f", retangulo.diagonal());


        sc.close();
    }
}
