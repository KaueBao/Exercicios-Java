package exwhile;

import java.util.Scanner;


public class Ex01Senha2002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        while (x != 2002) {
            System.out.println("Senha invalida");
            x = sc.nextInt();
        }
        if (x == 2002) {
            System.out.println("Acesso Concedido");
        }
    }
}