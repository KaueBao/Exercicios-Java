import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) throws IOException {
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