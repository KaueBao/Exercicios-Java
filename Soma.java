import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int valor1, valor2;
      System.out.printf("Por favor Digite o valor 1:");
      valor1 = sc.nextInt();
      sc.nextLine();
      System.out.printf("Por favor Digite o valor 2:");
      valor2 = sc.nextInt();
      sc.nextLine();

      System.out.println("DADOS DIGITADOS:");
      System.out.println(valor1);
      System.out.println(valor2);
      System.out.printf("A soma de seus valores é:%d",valor1 + valor2);

      sc.close();
   }
}
