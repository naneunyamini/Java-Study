
package array;

public class ArrayDi3 {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        int i = 1;

        //순서대로 1씩 증가하는 값을 입력함
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }

        // 2차원 배열의 길이를 활용함
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); //띄어쓰기
            }
            System.out.println(); //한 행이 끝나면 라인을 변경하기

        }
    }
}
