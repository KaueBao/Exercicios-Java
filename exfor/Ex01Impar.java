package exfor;

import java.util.Scanner;

public class Ex01Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();// recebe o X
        for (int impar = 1; impar<= X;){;// considera impar como 1 e roda o codigo ate impar ser igual a x
            System.out.println(impar);// mostra o impar na tela
            impar = impar + 2;//ira somar o impar com 2 toda vez q o codigo voltar aqui
        }
        sc.close();
    }
}
