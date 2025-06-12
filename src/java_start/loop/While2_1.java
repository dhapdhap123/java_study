package java_start.loop;

public class While2_1 {

    public static void main(String[] args) {
        int cnt = 0;

        int num = 0;
        while (cnt < 3){
            num += ++cnt;
        }
        System.out.println("num = " + num);
    }
}
