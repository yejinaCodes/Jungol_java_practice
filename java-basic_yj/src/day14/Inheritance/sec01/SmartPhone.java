package day14.Inheritance.sec01;

public class SmartPhone extends Phone {

  //필드 선언

  //생성자 선언
  public SmartPhone(String model, String color){
    //방법 1)
//    super();
//    this.model = model;
//    this.color = color;
    //방법 2)
    super(model, color);
    System.out.println("Smart Phone(String, model, String color) 생성자 실행함");

  }

  //메소드 선언


}