package java_basic.class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];


        MovieReview interstella = new MovieReview();
        interstella.title = "인터스텔라";
        interstella.review = "개 쩌는 영화";
        movieReviews[0] = interstella;

        MovieReview yourName = new MovieReview();
        yourName.title = "너의 이름은";
        yourName.review = "감성 쩌는 영화";
        movieReviews[1] = yourName;


        for (MovieReview movieReview: movieReviews){
            System.out.println(movieReview.title);
            System.out.println(movieReview.review);
        }

    }
}
