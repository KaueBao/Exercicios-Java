package exwhile;

import java.util.Scanner;


public class Ex02Quadrante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        while (!(x == 0 || y == 0)) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            }
            if (x < 0 && y > 0) {
                System.out.println("Q2");
            }
            if (x < 0 && y < 0) {
                System.out.println("Q3");
            }
            if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

    }
}
