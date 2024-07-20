package day13.VO;

public class Animal extends Object{
  public Animal(){
    super(); //new Object() 가 생성된다.
  }
  public void eat(){
    System.out.println("Animal eat!"); //추상적인 객체(대분류)
  }


}
