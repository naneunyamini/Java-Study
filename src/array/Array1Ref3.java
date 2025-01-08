
package array;

public class Array1Ref3 {

    public static void main(String[] args) {

        int[] students; // 배열을 담을 수 있는 변수 선언
        students = new int[]{90,80,70,60,50}; // 배열 생성과 초기화


        // 리팩토링
        for (int i =0; i< students.length; i++){
            System.out.println((i+1) + " 점수 " +  students[i]);
        }
    }
}
