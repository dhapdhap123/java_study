package java_mid1.enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountSevice discountSevice = new DiscountSevice();
        int basic = discountSevice.discount(ClassGrade.BASIC, price);
        int gold = discountSevice.discount(ClassGrade.GOLD, price);
        int diamond = discountSevice.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급 할인 금액 " + basic);
        System.out.println("GOLD 등급 할인 금액 " + gold);
        System.out.println("DIAMOND 등급 할인 금액 " + diamond);
    }
}
