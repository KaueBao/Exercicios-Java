import java.util.Locale;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      double valor1,areacirculo;
      System.out.print("Por favor Digite o valor do raio:");
      valor1 = sc.nextDouble();
      sc.nextLine();

      System.out.println("DADOS DIGITADOS:");
      System.out.println(valor1);
      areacirculo = Math.pow(valor1,2) * 3.14159;
      System.out.printf("A área do circulo de raio (%.2f) é aproximadamente:%.4f",valor1,areacirculo);

      sc.close();
   }
}
