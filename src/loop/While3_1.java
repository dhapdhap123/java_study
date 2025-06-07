package loop;

public class While3_1 {

    public static void main(String[] args) {
        int i = 10;
        int endNum = 12;
        int sum = 0;

        while (i <= endNum){
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
