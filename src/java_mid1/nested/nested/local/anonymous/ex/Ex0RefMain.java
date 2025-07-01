package java_mid1.nested.nested.local.anonymous.ex;

public class Ex0RefMain {

    public static void printHello(String program){
        System.out.println("프로그램 시작");
        System.out.println("Hello " + program);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        printHello("Java");
        printHello("Spring");
    }
}
