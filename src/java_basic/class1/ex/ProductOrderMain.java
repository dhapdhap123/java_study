package java_basic.class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        productOrders[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrders[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        productOrders[2] = coke;

        int sum = 0;
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
