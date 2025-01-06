package casting;

public class Casting4 {

    public static void main(String[] args) {

        int div1 = 3/2; // 같은 타입형
        System.out.println("div1 = " + div1);

        double div2 = 3/2; // 같은 타입형 ( 결과값만 double형)
        System.out.println("div2 = " + div2);

        double div3 = 3.0 /2; // 자동 형변환
        System.out.println("div3 = " + div3);

        double div4 = (double)3 /2; // 자동 형변환
        System.out.println("div4 = " + div4);

        int div5 = (int) 3.0 /2; // 낮은 타입일 때는 명시적 형변환이 필요
        System.out.println("div5 = " + div5);

        /* 따라서 같은 타입 형인 경우에는 그 타입의 형태로 나오고
           다른 타입 형인 경우에는 자동으로 형변환이 이루어짐
         */
    }
}
