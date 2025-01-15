package construct;

public class MethodInitMain3 {

    //메소드를 사용해서 초기값 설정의 반복을 제거해보자 !
    public static void main(String[] args) {
        MethodInit member1 = new MethodInit();
        member1.initMember("user1",15,90);

        MethodInit member2 = new MethodInit();
        member2.initMember("user2",16,80);

        MethodInit[] members = {member1, member2};

        for (MethodInit member : members) {
            System.out.println("이름: "+member.name+"나이: "+member.age+"성적: "+member.grade);
        }

    }



}
