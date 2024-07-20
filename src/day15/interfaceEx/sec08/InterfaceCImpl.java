package day15.interfaceEx.sec08;

public class InterfaceCImpl implements InterfaceC{
//interface의 다중 상속

  @Override
  public void methodC() {
    System.out.println("method c");
  }

  @Override
  public void methodA() {
    System.out.println("method a");
  }

  @Override
  public void methodB() {
    System.out.println("method b");
  }
}