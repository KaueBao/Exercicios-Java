package exclass3_student;

public class Student {
    double nota1;
    double nota2;
    double nota3;


    public double getSomanotas(){
        return nota1 + nota2 +nota3;
    }

    public void checagem() {
        if ((getSomanotas()) >= 60) {
            System.out.printf("FINAL GRADE %.2f%n", getSomanotas());
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE %.2f%n", getSomanotas());
            System.out.printf("MISSING %.2f POINTS", 60 - getSomanotas());
        }
    }
}

