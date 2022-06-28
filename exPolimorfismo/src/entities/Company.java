package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double sumTax = 0.0;
        if (getNumberOfEmployees() > 10) {
            sumTax += (getAnualIncome() * 0.14);
        } else {
            sumTax += (getAnualIncome() * 0.16);
        }
        return sumTax;
    }
}
