package java_basic.poly.ex2;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Caw(), new Duck()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 동물이 추가돼도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        System.out.println(animal.value);
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
