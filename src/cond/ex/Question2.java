package cond.ex;

public class Question2 {

    public static void main(String[] args) {
        int distance = 75;
        String stuff;

        if (distance <= 1){
            stuff = "도보";
        } else if (distance <= 10){
            stuff = "자전거";
        } else if (distance <= 100){
            stuff = "자동차";
        } else {
            stuff = "비행기";
        }

        System.out.println("stuff = " + stuff);
    }
}
