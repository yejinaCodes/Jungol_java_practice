package javajungsuk;
import java.util.Scanner;

public class Practice1 {

  boolean intCompare(int x) {
    if (x >= 10 && x < 20) {
      return true;
    }
    return false;
  }

  boolean int2Compare(int x) {
    if (x % 400 == 0 || x % 4 == 0) {
      if (x % 100 != 0) {
        return true;
      }
    }
    return false;
  }

  boolean characterCompare(char n) {
    //??
    boolean result = (n == ' ' || n == '\t');
    return result;
  }

  boolean character2Compare(char n) {
    if (n == 'x' || n == 'X') {
      return true;
    }
    return false;
  }

  boolean character3Compare(char n) {
    if (n >= '0' && n <= '9') {
      return true;
    }
    return false;
  }

  boolean character4Compare(char n) {
    //대문자 혹은 소문자.
    if (n >= 65 && n <= 122) {
      return true;
    }
    return false;
  }

  boolean booleanCompare(boolean b) {
    if (!b) {
      return true;
    }
    return false;
  }

  boolean stringCompare(String st) {
    //==는 주소값이 다름.
    if (st.equals("yes")) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Practice1 first = new Practice1();

    System.out.print("Input integer: ");
    //1) int 비교
    Scanner sc = new Scanner(System.in);
    int xx = sc.nextInt();
    boolean result = first.intCompare(xx);
    System.out.println(result);

    System.out.print("Input character: ");
    //2) char 비교
    sc.nextLine();
    char ch = sc.nextLine().charAt(0);
    result = first.characterCompare(ch);
    System.out.println(result);

//    System.out.print("Input character: ");
//    //3) char 비교
//    char ch2 = sc.next().charAt(0);
//    result = first.character2Compare(ch2);
//    System.out.println(result);
//
//    System.out.print("Input character: ");
    //4) char 비교
//    char ch3 = sc.next().charAt(0);
//    result = first.character3Compare(ch3);
//    System.out.println(result);
//
//    System.out.print("Input character: ");
//    //5) char 비교
//    char ch4 = sc.nextLine().charAt(0);
//    result = first.character4Compare(ch4);
//    System.out.println(result);
//
//    System.out.print("Input integer: ");
//    //6) int 비교
//    xx = sc.nextInt();
//    result = first.int2Compare(xx);
//    System.out.println(result);
//
//    System.out.print("Input boolean: ");
//    //7) boolean 비교
//    boolean bool = sc.nextBoolean();
//    result = first.booleanCompare(bool);
//    System.out.println(result);
//
//    System.out.println("Input String: ");
//    //8) string 비교
//    String str = sc.next();
//    result = first.stringCompare(str);
//    System.out.println(result);
//    }
  }
}