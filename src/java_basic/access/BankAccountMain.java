package java_basic.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.deposit(-1000);
        account.withdraw(3000);
        System.out.println(account.getBalance());
    }
}
