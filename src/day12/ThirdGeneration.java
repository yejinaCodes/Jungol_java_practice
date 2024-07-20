package day12;
  class Parent{
    String name = "홍길순";
    void details(){
      System.out.println(this.name);
    }
  }
  class Child extends Parent {
    String name = "홍길동";
    void details(){
      System.out.println(this.name);
    }
    void printDetails(){
      super.details();
      details();
      System.out.println("부모 이름 : " + super.name);
      System.out.println("자식 이름 : " + this.name);
    }
  }

  class SubFather extends GrandFather{
    String familyName = "홍";
    String houseAddress = "노원";
    void printFather(){
      System.out.println("나는 아버지입니다. 나는 할아버지로부터 상속받습니다. ");
    }
  }
  class SubSon extends SubFather{
    void printSon(){
      System.out.println("나는 아들입니다. ");
      System.out.println("나는 아버지로부터 상속받습니다. ");
      System.out.println("나의 아버지는 프로그래머");
      System.out.println("나의 집은 " + super.houseAddress);
    }
  }

  public class ThirdGeneration {
    public static void main(String[] args) {
//      SubSon objSon = new SubSon();
//      objSon.printSon();
//      objSon.printFather();
//      objSon.printGrandFather();
        Child objChild = new Child();
        objChild.printDetails();
  }
}
