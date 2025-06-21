package java_mid1.lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitArr = fruits.split(",");

        for (String f : fruitArr) {
            System.out.println(f);
        }

        String joinedString = String.join("->", fruitArr);
        System.out.println("joinedString = " + joinedString);
    }
}
