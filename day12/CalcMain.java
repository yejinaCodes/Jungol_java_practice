package day12;

import java.util.Scanner;

public class CalcMain {

  public static void main(String[] args) {
    Inheritance01 obj = new Inheritance01();
    Scanner sc = new Scanner(System.in);
    System.out.print("2수를 입력하시오: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    obj.addition(a,b);
    obj.subtraction(a,b);
    obj.multiplication(a,b);
  }

}
