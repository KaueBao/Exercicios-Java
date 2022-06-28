package exBanco;

public class Banco {
    private final int numAccount;
    private double balance;
    private String name;
    public double deposit;

    Banco (int numAccount,String name) {
        this.numAccount = numAccount;
        this.name = name;
        resetValor();
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void resetValor(){
        balance = 0;
        deposit = 0;
    }

    public void enterNumber(int num){
        System.out.println("Enter account number:");
    }


    public double depositFunction(double deposito){
        balance += deposito;
        return balance;
    }

    public double withdrawFunction(double saque){
        balance -= saque+5;
        return balance;
    }

    public void updateData(){
        System.out.printf("Account data: %n");
        System.out.printf("Account %d, Holder: %s, Balance: %.2f%n",numAccount,name,balance);
    }

}


