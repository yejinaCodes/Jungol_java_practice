package day15.interfaceEx.sec08;

public class ExtendsExample {

  public static void main(String[] args) {

    //ia.methodB();
    InterfaceCImpl imple = new InterfaceCImpl();
    //type제한을 한 것임.
    InterfaceA ia = imple;
    ia.methodA();

    InterfaceB ib = imple;
    ib.methodB();

    InterfaceC ic = imple;
    ic.methodA();
    ic.methodB();
    ic.methodC();

    System.out.println();


  }
}