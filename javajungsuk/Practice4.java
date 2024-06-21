package javajungsuk;

public class Practice4 {
  public static void main(String[] args) {
    solution();
  }
  public static void solution(){
    int sum = 0;
    int i = 1;
    while(sum < 100){
      if(i%2 == 0){
        sum += -(i);
      }
      else{
        sum += i;
      }
      i++;
    }
    System.out.println("sum: " + sum + " i: " + i);
  }
}
