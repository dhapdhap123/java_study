package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int totalCount = input.nextInt();
        input.nextLine();

        ProductOrder[] productOrders = new ProductOrder[totalCount];
        for (int i = 0; i < totalCount; i++){
            System.out.print("상품명:");
            String productName = input.nextLine();
            System.out.print("가격:");
            int price = input.nextInt();
            System.out.print("수량:");
            int quantity = input.nextInt();
            input.nextLine();

            productOrders[i] = initOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder initOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static int getTotalAmount(ProductOrder[] productOrders){
        int sum = 0;
        for (ProductOrder p : productOrders) {
            sum += p.price * p.quantity;
        }
        return sum;
    }

    static void printOrders(ProductOrder[] productOrders){
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }

}
