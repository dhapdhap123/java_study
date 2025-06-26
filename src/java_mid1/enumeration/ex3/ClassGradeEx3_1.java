package java_mid1.enumeration.ex3;

public class ClassGradeEx3_1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountSevice discountSevice = new DiscountSevice();
        int basic = discountSevice.discount(Grade.BASIC, price);
        int gold = discountSevice.discount(Grade.GOLD, price);
        int diamond = discountSevice.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급 할인 금액 " + basic);
        System.out.println("GOLD 등급 할인 금액 " + gold);
        System.out.println("DIAMOND 등급 할인 금액 " + diamond);
    }
}
