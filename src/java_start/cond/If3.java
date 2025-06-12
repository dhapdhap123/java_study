package java_start.cond;

public class If3 {

    public static void main(String[] args) {
        int itemPrice = 15000;
        int age = 9;
        int discount = 0;

        if (itemPrice >= 10000) {
            discount += 1000;
        }
        System.out.println("discount = " + discount);
        if (age <= 10){
            discount += 1000;
        }

        System.out.println("discount = " + discount);
    }
}
