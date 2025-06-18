package java_basic.poly.ex4;


public class AbstractMain {

    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Cat(), new Dog(), new Caw()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    // 동물이 추가돼도 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.move();
        System.out.println("동물 소리 테스트 종료");
    }
}
