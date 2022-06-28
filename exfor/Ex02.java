package exfor;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, in, out;
        in = 0;
        out = 0;
        N = sc.nextInt();
        for (int x = 0; x < N; x++) {
            int num = sc.nextInt();
            if (10 <= num && num <= 20) {
                in++;
            } else {
                out++;
            }
        }
        sc.close();
        System.out.printf("in:%d%n", in);
        System.out.printf("out:%d", out);
    }
}
