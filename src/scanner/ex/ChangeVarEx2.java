package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }


        // num1을 int i에 참조하게 되면서 i의 수를 num2까지만 도달하도록 증가시킴
        for (int i = num1; i <=num2; i++){
            System.out.print(i);
            if ( i != num2){
                System.out.print(",");
            }
        }
    }
}
