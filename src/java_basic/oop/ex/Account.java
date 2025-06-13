package java_basic.oop.ex;

public class Account {
    int balance = 0;

    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
    void showBalance(){
        System.out.println("잔고 = " + balance);
    }
}
