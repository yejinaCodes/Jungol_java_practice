package day14.Inheritance.sec02.exam02;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone();
    smartPhone1.setModel("iphon16pro");
    smartPhone1.setColor("yellow");
    System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());
    //Phone으로부터 상속 받은 필드 읽기
    SmartPhone smartPhone2 = new SmartPhone("iphone16,", "yellow", true);
    System.out.println(smartPhone2.getModel() + " " + smartPhone2.getColor() + " " + smartPhone2.getWifi());


  }
}