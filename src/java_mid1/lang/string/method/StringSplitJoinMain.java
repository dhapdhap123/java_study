package java_mid1.lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        // join
        String join = String.join("-", split);
        System.out.println(join);

        System.out.println(split);
        System.out.println(String.join("", split));
    }
}
