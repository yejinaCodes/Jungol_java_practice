package day14.Inheritance.sec02.exam01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("iphone15 PRO", "white");
    System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());
    System.out.println("private의 필드의 값 리셋은 setter를 통해서 접근한다");
    smartPhone1.setColor("black");
    smartPhone1.setModel("iphone 16 PRO");
    System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());

  }
}