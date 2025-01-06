package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {

        //중요한 문제 !!
        int rows =5;

        for(int i=1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"); //print는 라인을 넘기지 않음
            }
            System.out.println(); // println은 라인을 넘김 -> 반드시 있어야 함
        }



    }
}
