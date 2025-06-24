package java_mid1.lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        int i3 = Integer.valueOf(str1);
        int i4 = Integer.valueOf(str2);
        System.out.println(i1 + i2);
        System.out.println(i3 + i4);
    }
}
