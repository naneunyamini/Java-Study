package loop;

public class DoWhile1 {
    public static void main(String[] args) {

        int i = 10;

        do{
            System.out.println("현재 숫자는: " + i);
            i ++;
        }while(i <3);

        /* do-while문은 최초 한번은 항상 실행됨
           따라서 조건식이 거짓이더라도 무조건 처음 코드 블럭 실행문은 출력됨 */
    }
}
