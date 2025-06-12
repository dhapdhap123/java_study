package java_start.method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        double avg1 = average(1, 2, 3);
        double avg2 = average(15, 25, 35);
    }

    public static double average(int a, int b, int c){
        return (a + b + c) / 3.0;
    }
}
