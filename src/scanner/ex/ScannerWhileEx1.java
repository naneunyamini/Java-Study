package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String str = scanner.nextLine();


            if ( str.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt(); // nextInt는 숫자만 가져오기 때문에 \n가 남아있음 따라서 다시 한번 nextline()을 만들어줌
            scanner.nextLine();

            /* 그렇지 않으면
            이름을 입력하세요 (종료를 입력하면 종료): 자바
            나이를 입력하세요: 39
            입력한 이름: 자바, 나이39
            이름을 입력하세요 (종료를 입력하면 종료): 나이를 입력하세요:

            이러한 결과값이 출력됨 !
             */
            System.out.println("입력한 이름: " + str + ", 나이" + age);


        }


    }
}
