package 클래스작성방법;

public class q_1Movie {
  String title = "";
  String genre = "";

  public void play(){
    System.out.printf("%s(%s) 상영중입니다.\n", this.title, this.genre);
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }


}
