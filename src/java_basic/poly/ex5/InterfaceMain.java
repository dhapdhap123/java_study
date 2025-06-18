package java_basic.poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); 인터페이스 생성 불가

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    public static void soundAnimal(InterfaceAnimal animal){
        animal.sound();

    }
}
