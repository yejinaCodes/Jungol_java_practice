package 클래스작성방법;

public class q_1TestMovie {

  public static void main(String[] args) {
    q_1Movie myMovie = new q_1Movie();
    myMovie.setTitle("어거스트 러쉬");
    myMovie.setGenre("Drama");
    myMovie.play();

    System.out.println("--------------------");

    q_1Movie yourMovie = new q_1Movie();
    yourMovie.setTitle("나는 전설이다");
    yourMovie.setGenre("SF");
    yourMovie.play();
  }

}

