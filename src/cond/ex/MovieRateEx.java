package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {

        // 너무 어렵게 한 느낌 ,,,,
        /*
        double rating = 7.1;
        String movie1 = "어바웃타임";
        String movie2 = "토이스토리";
        String movie3 = "고질라";

        if ( rating == 9){
            System.out.println(movie1 + " 을 추천합니다");
        } else if ( rating == 8 || rating >7){
            System.out.println(movie1 + " 을 추천합니다");
            System.out.println(movie2 + " 을 추천합니다");
        } else if ( rating == 7){
            System.out.println(movie1 + " 을 추천합니다");
            System.out.println(movie2 + " 을 추천합니다");
            System.out.println(movie3 + " 을 추천합니다");
        }

         */

        /*그리고 이때는 동시에 조건이 성립되는 경우가 존재하므로
          독립적인 if문을 사용해야 함 */

        double rating = 7.1;

        if (rating <= 9){
            System.out.println("어바웃타임을 추천합니다");
        }
        if (rating <=8) {
            System.out.println( "토이 스토리를 추천합니다");
        }
        if (rating <=7){
            System.out.println("고질라를 추천합니다");
        }
    }
}
