package exwhile;

import java.util.Scanner;

public class Ex03Posto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool, gasolina, diesel;
        String tipo;
        boolean a = true;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        while (a) {
            tipo = sc.nextLine();
            switch (tipo) {
                case "1" -> alcool = alcool + 1;
                case "2" -> gasolina = gasolina + 1;
                case "3" -> diesel = diesel + 1;
                case "4" -> a = false;
                default -> System.out.println("Opção Inválida");
            }
        }
        sc.close();
        System.out.printf("Muito Obrigado %n Alcool: %d %n Gasolina:%d %n Diesel:%d %n",
                            alcool,gasolina,diesel);
    }


}
