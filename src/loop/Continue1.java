package loop;

public class Continue1 {

    public static void main(String[] args) {

        int i =1;

        while(i <= 5){
            if (i == 3){
                i ++;
                continue;
            }
            System.out.println(i);
            i ++;
        }
        /* i가 1인 경우에는 조건에 성립하지만 if문은 성립하지 않으므로
           출력되고 i 1씩 증가함 ... 다음음로 i가 3인 경우에는 조건에
           성립하고 if문에도 성립하는 조건임 -> i가 1이 증가하고 continue이므로
           sout 으로 가지 못하고 다시 while으로 돌아감
           따라서 3만 출력되지 못함
        */
    }
}
