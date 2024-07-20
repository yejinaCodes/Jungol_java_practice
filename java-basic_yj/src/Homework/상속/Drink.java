package Homework.상속;

public class Drink {
  private String name;
  private int price;
  private int count;

  public Drink(){}
  //맴버변수를 초기화하는 생성자 메서드:
  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }
  //this.로 멤버변수 접근할 경우에는 method는 static하면 안됨?
  public int getTotalPrice(){
    return this.price*this.count;
  }
  public static void printTitle(){
    System.out.println("상품명\t단가\t  수량\t  금액");
  }
  public void printData(){

    System.out.println(this.name + "\t\t" + this.price
        + "\t\t" + this.count + "\t\t" + getTotalPrice());
  }
}
