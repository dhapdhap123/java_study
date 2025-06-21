package java_mid1.lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIdx = str.indexOf(ext);
        String fileName = str.substring(0, extIdx);
        System.out.println("fileName = " + fileName);
        System.out.println("ext = " + ext);
    }
}
