package java_mid1.lang.string.method;

public class StringUtilsMain {

    public static void main(String[] args) {
        int num = 10;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // value of
        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);

        // 문자 + X -> 문자
        System.out.println("" + num);
        System.out.println("" + bool);
        System.out.println("" + obj);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);
        for (char c : strCharArray) {
            System.out.println(c);
        }
    }
}
