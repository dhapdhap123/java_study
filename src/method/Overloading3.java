package method;

public class Overloading3 {

    public static void main(String[] args) {
        add(1, 3.1);
        add(1.2, 3.4);
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }
}
