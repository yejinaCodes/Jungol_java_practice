package day12;

public class Son extends Father{
  String name(){
    return "길동";
  }
  void printDetails(){
    String fn = this.familyName();
    System.out.println("나의 이름은 " + fn + this.name());
    //System.out.println("나의 이름은 " + super.familyName() + this.name());
    System.out.println("나의 아버지는 " + this.dadswork());
    System.out.println("나의 집은 " + this.houseAdress());
  }
}
