package day18.mathEx;

public class MathEx01 {

  public static void main(String[] args) {
    //절대값 반환
    System.out.println(Math.abs(-1));

    //1.4, 1.6, -1.5, 1 : 반올림
    System.out.println(Math.round(-1.5));
    //올림
    System.out.println(Math.ceil(1.4));

    //내림
    System.out.println(Math.floor(1.6));

    //제곱근
    System.out.println(Math.sqrt(9));

    //Math.random() 0.0<=~~~~<1.0
    System.out.println((int)(Math.random()*10+1));

    double random = Math.floor((Math.random()*10)+1);
    System.out.println("random: " +  (int) random);
  }
}
