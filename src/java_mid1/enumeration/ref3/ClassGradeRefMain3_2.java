package java_mid1.enumeration.ref3;

public class ClassGradeRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        int basic =  Grade.BASIC.discount(price);
        int gold =  Grade.GOLD.discount(price);
        int dimmond =  Grade.DIAMOND.discount(price);
    }
}
