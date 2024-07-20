package day14.Inheritance.sec05.package2;

import day14.Inheritance.sec05.package1.A;

public class D extends A {

  //생성자 선언
  public D() {
    //A() 생성자 호출
    super();        //o
  }

  //메소드 선언
  public void method1() {
    //A 필드값 변경
    this.field = "value";  //o
    //A 메소드 호출
    this.method();      //o
  }

  //메소드 선언
//  public void method2() {
//    A a = new A();		//x
//    a.field = "value"; 	//x
//    a.method(); 			//x
//  }

  public static void main(String[] args) {
    D d = new D();
    d.method1();
  }
}
//D클래스는 A클래스와 다른 패키지에 있지만 A의 자식이기 때문에 protected필드, 생성자, 메소드에 접근할 수 있다
//단 객체를 새로 new하여 생성할 수 없다. super()를 이용한 호출은 가능하다.
