package day14.Inheritance.sec03.exam01;

public class Computer extends Calculator {

  //메소드 오버라이딩
  @Override //compile할때 체크해주는 마크이다.
  public double areaCircle(double r) {
    System.out.println("Computer areaCircle() 실행");
    double area = super.areaCircle(r);
    System.out.println("부모의 areaCircle() 실행 결과: " + area);
    return r* Math.PI;
  }
//  public Computer(){
//    super()
//  }

}