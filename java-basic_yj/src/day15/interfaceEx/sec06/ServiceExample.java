package day15.interfaceEx.sec06;

public class ServiceExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언과 구현 객체 대입
    Service service = new ServiceImpl();

    //디폴트 메소드 호출
    service.defaultmethod1();
    service.defaultmethod2();

    //정적 메소드 호출
    Service.staticMethod1(); //interface으로 직접 호출 가능
    Service.staticMethod2();

//    Service.aaa;
//    service.aaa;


  }
}