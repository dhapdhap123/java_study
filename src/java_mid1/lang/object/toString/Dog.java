package java_mid1.lang.object.toString;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

//    @Override
//    public String toString(){
//        return "이름: " + dogName + ", 나이: " + age;
//    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
