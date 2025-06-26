package java_mid1.enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountSevice discountSevice = new DiscountSevice();
        int basic = discountSevice.discount("BASIC", price);
        int gold = discountSevice.discount("GOLD", price);
        int diamond = discountSevice.discount("DIAMOND", price);

        // 없는 등급 입력 가능
        int vip = discountSevice.discount("VIP", price);

        // 오타
        int diamond2 = discountSevice.discount("DIAMONDD", price);
    }
}
