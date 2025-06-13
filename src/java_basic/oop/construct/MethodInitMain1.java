package java_basic.oop.construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = setMember("user1", 15, 90);
        MemberInit member2 = setMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }

    static MemberInit setMember(String name, int age, int grade){
        MemberInit member = new MemberInit();
        member.name = name;
        member.age = age;
        member.grade = grade;

        return member;
    }
}
