package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수"+Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수: "+currentUserCount);
        if(currentUserCount>Constant.MAX_USERS){
            System.out.println("대기자로 등록합니다.");
        }else{
            System.out.println("게임에 참가합니다.");
        }
    }
    // 상수를 이용함으로써 효율적이고 숫자 1000이 아닌 사람이 인지할 수 있도록 MAX_USERS라는 변수명으로 코드 이해 가능
}
