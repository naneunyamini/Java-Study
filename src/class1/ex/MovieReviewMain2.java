package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {

            //배열과 for문을 사용하여 한번에 코드 구현하기

            MovieReview[] reviews = new MovieReview[2];

            MovieReview movie1 = new MovieReview();
            movie1.title = "인셉션";
            movie1.review = " 인생은 무한 루프";
            reviews[0] = movie1;


            MovieReview movie2 = new MovieReview();
            movie2.title = "어바웃 타임";
            movie2.review = " 인생 시간 영화";
            reviews[1] = movie2;


            for (int i = 0; i < reviews.length; i++) {
                System.out.println("영화제목: " + reviews[i].title + ", 리뷰: " + reviews[i].review);
            }

            //for-each
            for (MovieReview review : reviews) {
                System.out.println("영화제목: " + review.title + ", 리뷰: " + review.review);

            }
        }

}
