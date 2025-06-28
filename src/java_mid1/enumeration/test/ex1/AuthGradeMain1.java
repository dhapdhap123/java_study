package java_mid1.enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value: values){
            System.out.println("grade="+value+", level="+value.getLevel()+", 설명="+value.getDescription());
        }
    }
}
