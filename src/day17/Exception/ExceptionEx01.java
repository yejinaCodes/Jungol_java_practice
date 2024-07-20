package day17.Exception;

public class ExceptionEx01 {
  public static void main(String[] args) {
    printLengthString("JavaDATABASE_PROGRAMMING");
    printLengthString(null);
  }
  public static void printLengthString(String data) {
    int result = 0;
    System.out.println("문자 수  = "+ result);

    try {
      result = data.length();
      Class.forName("Java.lang.String");
      System.out.println("String 클래스가 존재합니다.");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch(NullPointerException e) {
      //System.err.println(e.getMessage());
      //System.out.println(e.toString());
      e.printStackTrace();
      System.out.println("널 예외처리를 완료");
    }catch (Exception e) {
      e.printStackTrace();
    }finally {
      System.out.println("마무리 해!");
    }
  }
}
