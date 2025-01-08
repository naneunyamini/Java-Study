package array;

public class Array1Ref2 {

    public static void main(String[] args) {

        int[] students; // 배열을 담을 수 있는 변수 선언
        students = new int[5]; // 배열 생성

        // System.out.println(students); 참조값 확인 :[I@b4c966a
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;


        // 리팩토링
        for (int i =0; i< students.length; i++){
            System.out.println((i+1) + " 점수 " +  students[i]);
        }
    }
}
