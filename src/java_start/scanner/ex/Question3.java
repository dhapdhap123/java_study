package java_start.scanner.ex;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("상품명 : ");
        String foodName = scanner.nextLine();
        System.out.print("가격 : ");
        int foodPrice = scanner.nextInt();
        System.out.print("수량 : ");
        int foodQuantity = scanner.nextInt();

        System.out.print(foodName + " 총 " + foodPrice * foodQuantity + " 만큼 주문");
    }
}
