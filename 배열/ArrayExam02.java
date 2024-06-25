package 배열;

import java.util.Random;

public class ArrayExam02 {

  public static void main(String[] args) {
    int[] array = new int[5];
    Random r = new Random();
    for(int i=0;i<5;i++){
      int tmp = (r.nextInt(1,101));
      System.out.print(tmp + " ");

    }
  }

}
