package day13.VO;

public class Dog extends Animal{
  public Dog(){
    super();
  }
  //override(재정의): super class의 동일한 이름을 가진(파라미터, 파라미터 타입까지 똑같아야 함) 메서드를 재정의
  public void eat(){
    System.out.println("Dog eat!!!");
  }

}
