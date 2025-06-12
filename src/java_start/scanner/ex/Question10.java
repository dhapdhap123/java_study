package java_start.scanner.ex;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int price;
        int quantity;
        int totalPrice = 0;
        while (true){
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String productName = scanner.next();
                    System.out.print("가격을 입력하세요: ");
                    price = scanner.nextInt();
                    System.out.print("수량을 입력하세요: ");
                    quantity = scanner.nextInt();
                    totalPrice += price * quantity;
                    System.out.println("상품명: " + productName + " 가격: " + price + " 합계 : " + price * quantity);
                    break;
                case 2:
                    System.out.println("총 비용 : " + totalPrice);
                    totalPrice = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    return;
            }
        }
    }
}
