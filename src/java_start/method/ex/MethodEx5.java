package java_start.method.ex;

import java.util.Scanner;

public class MethodEx5 {

    public static void main(String[] args) {
        int balance = 10000;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("------------------------------------");

            System.out.print("선택: ");
            int option = input.nextInt();
            int amount;

            switch (option){
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = input.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = input.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                default:
                    return;
            }
        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
