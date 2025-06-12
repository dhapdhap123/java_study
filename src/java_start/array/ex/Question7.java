package java_start.array.ex;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCount = 10;
        String[] productNames = new String[maxCount];
        int[] productPrices = new int[maxCount];
        int productCount = 0;


        while (true) {
            System.out.println("1.상품 등록, 2. 상품 목록, 3. 종료");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (productCount >= maxCount){
                        System.out.println("상품은 10개를 초과할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름: ");
                    productNames[productCount] = scanner.next();
                    System.out.print("상품 가격: ");
                    productPrices[productCount] = scanner.nextInt();
                    productCount++;
                    break;
                case 2:
                    for (int i = 0; i < productCount; i++){
                        System.out.print("상품명: " + productNames[i] + "상품 가격: " + productPrices[i]);
                        System.out.println();
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
