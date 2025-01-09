package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    // 학생 수 입력받기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int num = sc.nextInt();

        int[][] scores = new int[num][3];
        String[] subjects = {"국어","영어","수학"};


        for (int i =0; i<scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for(int j=0; j < subjects.length; j++){
                System.out.print(subjects[j]+"의 점수:");
                scores[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<3;i++){
            int sum =0;
            for(int j=0;j<3;j++){
                sum += scores[i][j];
            }
            double avr = sum / 3.0;
            System.out.println((i+1)+"번 학생의 총점: "+sum+", 평균: "+avr);

        }
    }
}
