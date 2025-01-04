package variable.ex;

public class VarEx3 {
    public static void main(String[] args) {

        long a;
        a = 10000000000L; //리터럴은 기본이 int이므로 반드시 L를 붙여줘야 함
        System.out.println(a);
        //soutv 단축어도 존재함 ->System.out.println("a = " + a);

        boolean b;
        b = true;
        System.out.println(b);
    }
}
