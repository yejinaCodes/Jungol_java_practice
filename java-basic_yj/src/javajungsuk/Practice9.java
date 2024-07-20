package javajungsuk;

public class Practice9 {

  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;
    int length = 4;

    while(length>-1){
      int tmp = num/(int)(Math.pow(10, length));
      sum += tmp;
      //System.out.println(tmp);
      num = num%(int)(Math.pow(10,length));
      length -= 1;
    }
    System.out.println("sum = "+ sum);
  }

}
