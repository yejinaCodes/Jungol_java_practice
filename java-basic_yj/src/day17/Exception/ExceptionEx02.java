package day17.Exception;

public class ExceptionEx02 {
  public static void main(String[] args) {
    String[] array = {"1000", "l000", null, "200"};

//    for(String str : array){
//      System.out.println(str);
//    }
    try {
      for(int i=0; i<10;i++){
        int value = Integer.parseInt(array[i]);
        System.out.println("array[ " + i + "] : " + value);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    }catch (NullPointerException | NumberFormatException e) {
     e.printStackTrace();
    }
    System.out.println("프로그램 안전 종료");
  }

}
