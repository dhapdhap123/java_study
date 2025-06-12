package java_basic.class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview interstella = new MovieReview();
        interstella.title = "인터스텔라";
        interstella.review = "개 쩌는 영화";

        MovieReview yourName = new MovieReview();
        yourName.title = "너의 이름은";
        yourName.review = "감성 쩌는 영화";

        System.out.println(interstella.title + " : " + interstella.review);
        System.out.println(yourName.title + " : " + yourName.review);
    }
}
