package javajungsuk;

public class Practice4 {
  public static void main(String[] args) {
    int result = 0;
    int i = 1;
    while(true){
      //??
      if(result >= 100){
        System.out.println(i);
        System.out.println(result);
        break;
      }
      result += i;
      i++;
      result -= i;
      i++;
      //System.out.println(i);
    }
  }
}
