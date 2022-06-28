import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enumerate.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static enumerate.Color.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        List<Shape> circulos = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        for (int i = 1; i <= shapes; i++) {
            System.out.println("Shape #" + i + " data:");

            System.out.print("Color(BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());

            System.out.print("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            switch (Character.toUpperCase(ch)) {
                case 'R' -> {
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    Rectangle rec = new Rectangle(color, width, height);
                    list.add(rec);
                }
                case 'C' -> {
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(color, radius);
                    circulos.add(circle);
                }
                default -> System.out.println("Opção inválida");
            }
        }


        System.out.println("Areas:");

        System.out.println("Rectangle Area");
        for (Shape values : list) {
            System.out.printf("%.2f%n", values.area());
        }

        System.out.println("Circle Area");
        for (Shape shape : circulos) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
