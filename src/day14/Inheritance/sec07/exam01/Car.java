package day14.Inheritance.sec07.exam01;

public class Car {

  //필드 선언 타이어 달기
  public Tire tire; //상속을 이용한 하위 클래스를 담을 수 있는 필드이다.
  public void running(){
    tire.roll();
  }
  
}