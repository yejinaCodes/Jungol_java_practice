package Homework_july.상속;

public class Alcohol extends Drink{
  private String name;
  private int price;
  private int count;
  private double alcper;

  public Alcohol(){}
  public Alcohol(String name, int price, int count, double a) {
    super(name, price, count);
    this.name = name;
    this.price = price;
    this.count = count;
    this.alcper = a;

  }
  public static void printTitle(){
    System.out.println("상품명(도수[%])\t 단가\t  수량\t  금액");
  }

  @Override
  public void printData() {
    System.out.println(this.name + "(" + this.alcper + ")" + "\t\t   " + this.price
        + "\t\t" + this.count + "\t\t  " + getTotalPrice());
  }
}
