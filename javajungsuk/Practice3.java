package javajungsuk;

public class Practice3 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for(int j = 0; j <= i; j++){
        sum += j;
      }
    }
    System.out.println(sum);
  }
}
