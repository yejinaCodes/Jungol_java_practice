package Homework_july.prob0709;

import java.util.Scanner;

public class String01_Prob2 {
  public static void main(String[] args) {
    String inputStr;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("문자열을 입력하세요. : ");
    inputStr = keyboard.nextLine();

    //프로그램을 구현하세요.
    int end = inputStr.length();
    for(int i=end-1; i>=0; i--){
      System.out.print(Character.toUpperCase(inputStr.charAt(i)));
    }
  }
}
