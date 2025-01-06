package loop;

public class While2_3 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i =" + i + " sum = " + sum);
            i++; // 변화하는 변수의 값을 설정해줌
            // i가 4인 순간 실행 종료
        }
    }
}
