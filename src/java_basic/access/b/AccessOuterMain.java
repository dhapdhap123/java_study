package java_basic.access.b;

import java_basic.access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default 호출 불가 : 같은 패키지가 아님
//        data.defaultField = 1;
//        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 1;
//         data.privateMethod();

        data.innerAccess();
    }
}
