package exclass3_student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student aluno = new Student();

        System.out.print("Nota1:");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota2:");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota3:");
        aluno.nota3 = sc.nextDouble();

        aluno.checagem();


        sc.close();
    }
}
