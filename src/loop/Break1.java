package loop;

public class Break1 {
    public static void main(String[] args) {

        int sum = 0;
        int i =1;

        while(true){
            sum = sum +i; /* sum이 10일 경우에는 if문에 성립하지 않으므로
                             바로 i ++; 으로 감 */

            if (sum > 10){ // 1+2+3+4+5 일때 조건이 성립함
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // 반드시 break가 있어야 무한반복이 안됨
            }
            i ++;
        }
    }
}
