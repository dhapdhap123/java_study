package java_start.method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int count){
        for (int i = 0; i < count; i++){
            System.out.println(message);
        }
    }
}
