package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m =10; // m 생존 시작

        //항상 작동하는 if문
        if(true){
            int x = 20; // x 생존 시작
            System.out.println("if m = "+m);
            System.out.println("if x = "+x);
        } // x 생존 종료
        /* 이 코드는 오류남
           System.out.println("main x = " +x);
         */
    }
}
