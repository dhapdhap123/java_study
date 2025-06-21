package java_mid1.lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat("java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str3 == str4);
        str3 += "asdf";
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str3 == str4);
    }
}
