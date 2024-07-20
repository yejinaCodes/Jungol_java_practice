package day15.interfaceEx.sec06;

public interface Service {

  //디폴트 메소드
  default void defaultmethod1(){
    System.out.println("나는 default method1");
    defaultCommon();
  }
  default void defaultmethod2(){
    System.out.println("나는 default method2");
    defaultCommon();
  }

  //private 메소드
  private void defaultCommon(){
    System.out.println("나는 default common이고 중복 코드 A 구현부 실행!");
  }

  //정적 메소드
  static void staticMethod1(){
    System.out.println("나는 staticMethod1이야");
  }
  static void staticMethod2(){
    System.out.println("나는 staticMethod2이야");
  }

  //private 정적 메소드
  private static void staticCommon(){
    System.out.println("나는 staticCommon이야");
  }
}