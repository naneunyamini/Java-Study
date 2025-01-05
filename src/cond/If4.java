package cond;

public class If4 {

    public static void main(String[] args) {
        // if-else 구문 : if문을 하나로 묶늗다
        // 중복체크를 줄이고 하나씩 내려오면서 체크함

        int age = 20 ;

        if ( age <= 7 ){
            System.out.println("미취학");
        } else if ( age >= 8 && age <= 13 ){
             System.out.println("초등학생");
        } else if ( age >= 14 && age <=16 ) {
            System.out.println("중학생");
        } else if ( age >= 17 && age <=19 ){
            System.out.println("고등학생");
        } else{
            System.out.println("성인");
        }
    }
}
