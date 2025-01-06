package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } // i 생존 종료됨 ( for문 안에서 선언한 변수는 for문 코드블록 안에서만 사용 가능)
    }
}
