
package array;

public class Array1Ref4 {

    public static void main(String[] args) {

        // 한번에 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50};


        // 리펙토링
        for (int i =0; i< students.length; i++){
            System.out.println((i+1) + " 점수 " +  students[i]);
        }
    }
}
