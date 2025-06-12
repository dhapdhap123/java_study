package java_basic.ref.ex;

import java_basic.ref.ex.ProductOrder;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = initOrder("두부", 2000, 2);
        productOrders[1] = initOrder("김치", 5000, 1);
        productOrders[2] = initOrder("콜라", 1500, 2);

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
