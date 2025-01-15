package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MethodInit member1 = new MethodInit();
        member1.name ="user1";
        member1.age = 15;
        member1.grade = 90;

        MethodInit member2 = new MethodInit();
        member2.name ="user2";
        member2.age = 16;
        member2.grade = 80;

        MethodInit[] members = {member1, member2};

        for (MethodInit member : members) {
            System.out.println("이름: "+member.name+"나이: "+member.age+"성적: "+member.grade);
        }

    }

}
