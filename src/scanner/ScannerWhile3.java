package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){

            System.out.print("정수를 입력하라");
            int intValue =input.nextInt();

            if( intValue == 0 ){
                break;
            }


            sum = sum + intValue;
        }
        System.out.println(sum); /* sum을 while문 바깥에서 써야 하므로
                                    sum을 외부에서 선언해야함 */
    }
}
