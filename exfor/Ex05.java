package exfor;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();
        int fat = 1;

        for(int i =0;N != 0;N -= 1){
            fat =fat * N;

        }System.out.println(fat);

        sc.close();
    }
}
