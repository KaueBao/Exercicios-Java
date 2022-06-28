package exEmployees;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroEmpregados;
        String nome;
        double salario;
        int id;
        int busca;

        System.out.println("Entre com a quantidade de empregados: ");
        numeroEmpregados = sc.nextInt();

        List <Employees> list = new ArrayList<>();

        for (int i = 0;i<numeroEmpregados;i++){
            System.out.println("Empregado #"+(i+1));
            System.out.print("ID: ");
            id = sc.nextInt();

            System.out.print("Nome: ");
            System.out.println(" ");
            nome = sc.next();

            System.out.print("Salario: ");
            salario = sc.nextDouble();

            Employees empregado = new Employees(id,nome,salario);
            list.add(empregado);
        }

        System.out.println("Id para aumentar salario:");
        busca=sc.nextInt();

        boolean acharFuncionario = false;

        list.sort(Employees.comparatorId); // Ajusta por ordem crescente
        for (Employees x : list) {
            if(busca == x.getId()) {
                acharFuncionario=true;
                System.out.println("Porcentagem para aumentar salario:");
                double porcentagem = sc.nextDouble();
                x.aumentarSalario(porcentagem);

                break;
            }
        }if(!(acharFuncionario)){
            System.out.println("Funcionario não existe.");
        }
        for (Employees x:list) {
            System.out.printf("%d , %s , %.2f",x.getId(),x.getnome(),x.getnome());
        }











//











        sc.close();
    }
}
