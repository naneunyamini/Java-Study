package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int minNum;
        int maxNum;

        System.out.println(n +"개의 정수를 입력하세요");
        for (int i=0; i <n; i++){
            arr[i] = scanner.nextInt();
        }

        // 가장 큰 정수와 가장 작은 정수 구하기
        minNum = maxNum = arr[0];
        for (int i =1; i<n; i++){
            if(arr[i] < minNum){
                minNum = arr[i];
            }
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
