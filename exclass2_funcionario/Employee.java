package exclass2_funcionario;

public class Employee {
    String name;
    double grossSalary;
    double tax;

    public String toString() {
        return "Employee: " + name + ", $" + String.format("%.2f",netSalary());
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary( double porcentagem) {
        double acrescimo = grossSalary * ( porcentagem / 100);
        return netSalary() + acrescimo;
    }
}


