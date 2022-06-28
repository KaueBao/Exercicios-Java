import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price:");
            double price = sc.nextDouble();

            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            switch (ch) {
                case 'c' -> list.add(new Product(name, price));
                case 'u' -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date dt = sdf.parse(sc.next());
                    list.add(new UsedProduct(name, price, dt));
                }
                case 'i' -> {
                    System.out.print("Customs fee: ");
                    double fee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, fee));
                }
                default -> System.out.println("This option doesn't exists:");
            }

        }

        for(Product produto : list){
            System.out.println(produto.priceTag());
        }


        sc.close();
    }
}
