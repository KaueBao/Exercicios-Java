package entitities;

public class BusinessAccount extends Account{ // extends -> classe Bussines recebe todos os atributos e metodos da classe account
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // executa a logica da classe base
        this.loanLimit = loanLimit;
    }

    public void loan (double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // recebe o metodo padrao da classe
        balance -= 2.0;
    }
}
