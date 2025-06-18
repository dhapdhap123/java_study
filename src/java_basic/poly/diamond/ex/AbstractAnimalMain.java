package java_basic.poly.diamond.ex;


public class AbstractAnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        soundAnimal(dog);
        flyAnimal(dog);
        soundAnimal(chicken);
        flyAnimal(chicken);
        soundAnimal(bird);
        flyAnimal(bird);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void flyAnimal(AbstractAnimal animal){
        if (animal instanceof Fly flyAnimal){
            System.out.println("동물 날기 테스트 시작");
            flyAnimal.fly();
            System.out.println("동물 날기 테스트 종료");
        }
    }
}
