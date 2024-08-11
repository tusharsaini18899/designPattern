package structural.proxy;

public class BankAccount implements Account {
    @Override
    public void withdraw() {
        System.out.println("Withdrawing money from bank...");
    }
}
