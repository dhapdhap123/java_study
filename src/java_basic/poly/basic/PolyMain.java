package java_basic.poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모에 자식 담기 -> 가능
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식에 부모 담기 -> 불가능
//        Child child1 = new Parent();

        // 자식 기능 호출 X -> 컴파일 오류
//        poly.childMethod();
    }
}
