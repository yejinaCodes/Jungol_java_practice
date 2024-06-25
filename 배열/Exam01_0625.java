package 배열;
import java.util.Scanner;
public class Exam01_0625 {

  public static void main(String[] args) {
    int [] array = new int[5];
    int total = 0;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<5;i++){
      int tmp = sc.nextInt();
      array[i] = tmp;
      //System.out.println("array[i]" + array[i]);
      total += tmp;
      //System.out.println(total);
    }
    for(int i=0;i<5;i++){
      double percentage = ((double) array[i]*100/total);
      //casting
      for(int j=0; j<(int)percentage;j++){
        System.out.print("*");
      }
      System.out.println("("+ percentage + "%)");
    }
  }

}
