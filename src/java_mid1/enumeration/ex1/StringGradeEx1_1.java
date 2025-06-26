package java_mid1.enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountSevice discountSevice = new DiscountSevice();
        int basic = discountSevice.discount(StringGrade.BASIC, price);
        int gold = discountSevice.discount(StringGrade.GOLD, price);
        int diamond = discountSevice.discount(StringGrade.DIAMOND, price);

        // 없는 등급 입력 가능
        int vip = discountSevice.discount("VIP", price);

        // 오타
        int diamond2 = discountSevice.discount("DIAMONDD", price);
    }
}
