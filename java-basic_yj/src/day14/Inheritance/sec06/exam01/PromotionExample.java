package day14.Inheritance.sec06.exam01;

//객체 타입 변환: 객체의 타입을 다른 타입으로 변환
//참조타입: 클래스타입, 인터페이스 타입, enum타입, 배열
//클래스의 타입변환은 클래스간 상속관계에 있는 클래스 사이에서 발생한다.
//업캐스팅(부모의 타입으로), 다운캐스팅(자식의 타입으로)
//Cat cat = new Cat();        Animal animal = cat; Promotion 자동변환됨
//고양이가 동물의 특징과 기능을 상속받았다면(extends Animal), 고양이는 동물이다.
//Animal animal = cat; 의 의미는 cat과 animal 변수는 타입만 다를 뿐, 동일한 cat
//객체를 참조

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {

  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();
    //상속계층에서 상위타입이라면 자동 타입 변환이 일어난다.
    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    //B b2 = c; <- 불가능
    //B b3 = e; <- 불가능
    C c1 = e;



  }
}