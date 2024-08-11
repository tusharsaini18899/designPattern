package structural.proxy;

public class ATM implements Account {
    @Override
    public void withdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
        System.out.println("Withdrawing money from ATM.....");
    }
}
