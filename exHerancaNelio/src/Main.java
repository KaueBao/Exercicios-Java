import entitities.Account;
import entitities.BusinessAccount;
import entitities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
//        Account acc = new Account(1001,"Alex",0.0);
//        BusinessAccount bacc = new BusinessAccount(1002,"Kaue",0.0,500.00);
//
//        //UPCASTING
//
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003,"Manu",0.0,200.0);
//        Account acc3 = new SavingsAccount(1004,"Joao",0.0,0.01);
//        acc1.getBalance();
//
//        //DOWNCASTING
//
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100);
//
//       // BusinessAccount acc5 = (BusinessAccount) acc3; //Nao e possivel fazer a conversao
//        // pois a BussinessAccount nao herda o SavingsAccount
//
//        if (acc3 instanceof BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan!");
//        }
//        if (acc3 instanceof SavingsAccount) {
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update");
//        }
        Account acc = new BusinessAccount(1001,"Alex",1000.0,500.00);

        acc.withdraw(200);
        System.out.println(acc.getBalance());


    }
}
