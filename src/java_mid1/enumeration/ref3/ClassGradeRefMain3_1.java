package java_mid1.enumeration.ref3;

public class ClassGradeRefMain3_1 {

    public static void main(String[] args) {
        int price = 10000;

        System.out.println("ClassGrade.BASIC.getClass() = " + Grade.BASIC.getClass());
        System.out.println("ClassGrade.GOLD.getClass() = " + Grade.GOLD.getClass());
        System.out.println("ClassGrade.DIAMOND.getClass() = " + Grade.DIAMOND.getClass());

        DiscountSevice discountSevice = new DiscountSevice();
        int basic =  discountSevice.discount(Grade.BASIC, price);
        int gold =  discountSevice.discount(Grade.GOLD, price);
        int dimmond =  discountSevice.discount(Grade.DIAMOND, price);

        System.out.println("ClassGrade.BASIC = " + Grade.BASIC);
        System.out.println("ClassGrade.GOLD = " + Grade.GOLD);
        System.out.println("ClassGrade.DIAMOND = " + Grade.DIAMOND);
    }
}
