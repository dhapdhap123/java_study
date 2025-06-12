package java_start.scanner.ex;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int price = scanner.nextInt();
            if (price == -1){
                break;
            }

            int quantity = scanner.nextInt();
            System.out.println(price * quantity);

        }
    }
}
