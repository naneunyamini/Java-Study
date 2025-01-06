package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;

        //temp라는 변수를 if문 안에 넣어서 군더더기 코드를 줄임
        if ( m > 0){
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
