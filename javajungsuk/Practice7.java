package javajungsuk;

public class Practice7 {

  public static void main(String[] args) {
    String str = "12345";
    int sum = 0;
    for(int i = 0; i < str.length(); i++){
      //int tmp = str[i];
      //자바에서는 toCharArray사용하기
      int tmp = (int)str.toCharArray()[i];
      sum += tmp;

    }
    System.out.println("sum= " + sum);
  }
}
