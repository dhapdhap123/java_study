package java_start.loop.ex;

public class Question5 {

    public static void main(String[] args) {
        int rows = 50;
        for (int i = 1; i <= rows; i++){
            String row = "";
            for (int j = 1; j <= i; j++){
                row += "*";
            }
            System.out.println(row);
        }
    }
}
