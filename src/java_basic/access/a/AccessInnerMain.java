package java_basic.access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default 호출 가능
        data.defaultField = 1;
        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 1;
//         data.privateMethod();

        data.innerAccess();
    }
}
