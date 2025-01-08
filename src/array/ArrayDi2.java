package array;

public class ArrayDi2 {

    public static void main(String[] args) {

        int [][] arr = {
                {1,2,3},
                {4,5,6}
        };


        for (int row =0; row <arr.length; row++){
            for (int col=0; col <arr[row].length; col++){
                System.out.print(arr[row][col] + " "); //띄어쓰기
            }
            System.out.println(); //한 행이 끝나면 라인을 변경하기
        }
    }
}
