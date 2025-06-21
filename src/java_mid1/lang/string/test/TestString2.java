package java_mid1.lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        for (String s: arr){
            System.out.println(s + ":" + s.length());
            System.out.printf("%s:%d\n", s, s.length());
        }
    }
}
