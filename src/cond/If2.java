package cond;

public class If2 {

    public static void main(String[] args) {
        int age = 20;

        if (age <= 7){
            System.out.println("미취학.");
        } else if (age <= 8 && age <= 13) {
            System.out.println("초등학생.");
        } else if (age <= 14 && age <= 16) {
            System.out.println("중학생.");
        } else if (age <= 16 && age <= 19) {
            System.out.println("고등학생.");
        } else {
            System.out.println("성인");
        }
    }
}
