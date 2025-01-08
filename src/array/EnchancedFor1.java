package array;

public class EnchancedFor1 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for (int i =0; i <numbers.length; i++){
            int num = numbers[i];
            System.out.println(num);
        }

        //for-each문
        for(int num: numbers){
            System.out.println(num);
        }

        //for-each문의 단축 키 : iter
        //향상된 for문을 사용할 수 없는 경우 ,증가하는 index의 값이 필요
        //인덱스(i)를 명시적으로 사용하는 경우
        for (int i =0; i<numbers.length; i++){
            System.out.println("number"+i+"번의 결과는"+numbers[i]);
        }
    }
}
