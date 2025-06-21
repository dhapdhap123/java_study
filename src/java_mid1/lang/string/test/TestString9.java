package java_mid1.lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splittedEmail = email.split("@");
        System.out.println("id: " + splittedEmail[0]);
        System.out.println("domain: " + splittedEmail[1]);
    }
}
