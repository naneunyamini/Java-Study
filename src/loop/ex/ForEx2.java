package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        //내가 한 방식
        for ( int count =2; count <= 20; count +=2 ){
            System.out.println( count );
        }

        //또는 변수를 2개를 사용하여 한번에 나타낼 수도 있음
        for (int num=2,count =1; count <=10; num +=2,count ++){
            System.out.println(num);
        }
        //또는 ( for문 안에는 하나의 조건만 들어가는게 좋음
        int num =2;
        for (int count =1; count <=10; count ++){
            System.out.println(num);
            num +=2;
        }
    }
}
