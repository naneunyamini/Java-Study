package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[]arr = new int[n];
        int sum =0;
        double avr;

        System.out.println(n+"개의 정수를 입력하세요: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);
        avr = (double) sum / n;
        System.out.println("입력한 정수의 평균: " + avr);

    }
}
