package javajungsuk;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice10 {

  public static boolean isNumber(String input){
    return Pattern.matches("^[0-100] * $", input);
  }

  public static void main(String[] args) {
    int answer = (int)(Math.random()*100)+1;
    int count = 0;
    String input = "";

    Scanner sc = new Scanner(System.in);



    do{
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 : ");
      input = sc.next();

      if(isNumber(input)){
        if (Integer.parseInt(input) < answer){
          System.out.println("더 큰 수를 입력하세요.");
          count++;
        }else if(Integer.parseInt(input) > answer){
          System.out.println("더 작은 수를 입력하세요");
          count++;
        }else if(Integer.parseInt(input) == answer){
          System.out.println("맞혔습니다.");
          System.out.println("시도횟수는" + count + "번입니다.");
        }
      }
      else{
        System.out.println("Please input num between 0-100");
        break;
      }
    }while(true);
  }
}
