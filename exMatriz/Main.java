package exMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;
        int n;

        m = sc.nextInt(); // linhas
        n = sc.nextInt(); // colunas


        int[][] mat = new int[m][n];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }


        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }

                //7 3 4
                //1 2 9
                //4 6 12


//        for (int i = 0; i <m;i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(mat[i][j]);
//            }
//        }


                sc.close();
            }
        }
    }
}