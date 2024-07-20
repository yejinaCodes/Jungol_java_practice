package MorningTest.M0709;

public class CellPhoneMain {

  public static void main(String[] args) {
    CellPhone cellphone = new CellPhone("iphone", 0);

    try{
      cellphone.charge(20);
      cellphone.printBattery();
      cellphone.call(300);
      cellphone.printBattery();
      cellphone.charge(50);
      cellphone.printBattery();
      cellphone.call(40);
      cellphone.printBattery();
      cellphone.call(-20);

    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }

  }

}
