package entities;

import entities.Enum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker () {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract (HourContract contract) {
        contracts.add(contract); // Adiciona um contrato na lista
    }

    public void removeContract (HourContract contract) {
        contracts.remove(contract); // Remove um contrato da lista
    }

    public double income(int year,int month)   {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); // Instancia um objeto da classe calendar
        for (HourContract c : contracts) {
            cal.setTime(c.getDate()); // Para cada contrato C sera setado uma data do calendario de acordo com a data definida
            int c_year = cal.get(Calendar.YEAR); // Pega o ano da data recebida
            int c_month = 1 + cal.get(Calendar.MONTH); // Pega o mes da data recebida
            if (year == c_year && month ==c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
