package operator;

public class Logical1 {

    public static void main(String[] args) {

        // && : 모두 참이어야 참임
        System.out.println("&&:AND 연산");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);


        // || : 둘 중에 하나만 참이면 참임
        System.out.println("||: OR 연산");
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        // ! : 부정 연산자
        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }


}
