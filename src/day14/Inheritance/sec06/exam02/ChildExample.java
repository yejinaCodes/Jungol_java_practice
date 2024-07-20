package day14.Inheritance.sec06.exam02;

public class ChildExample {

  public static void main(String[] args) {
    //자식 객체 생성
    Child child = new Child();

    //자동 타입 변환
    Parent parent = child; //부모 타입으로 upcasting
    //parent = (Child)parent;

    //메소드 호출
    parent.method1();
    parent.method2();
    ((Child) parent).method3();

  }
}