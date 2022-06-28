package exEmployees;


import java.util.Comparator;

public class Employees  {
    private Integer id;
    private String nome;
    private Double salario;


    public Employees(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario *= (1 + porcentagem / 100);
    }

    public static Comparator<Employees> comparatorId = new Comparator<Employees>() {
        public int compare(Employees a, Employees b){
            return a.id - b.id;
        }
    };

}

//    @Override
//    public int compare(Employees o1, Employees o2) {
//        return 0;
//    }

