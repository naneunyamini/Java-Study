package loop;

public class While_2 {

    public static void main(String[] args) {
        int count = 0;

        // while안에 조건을 넣고 조건에 만족하는 코드를 작성함
        while (count < 3){
            count = count + 1;
            System.out.println("현재 숫자는 : " + count);
        }
    }
}
