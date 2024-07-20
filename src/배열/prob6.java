package 배열;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob6 {
  private static void findMedian(ArrayList<Integer> array){
    //sort array
    System.out.print("input : [");
    for(int i=0;i<10;i++){
      System.out.print(array.get(i)+ " ");
    }
    System.out.println("]\n");
    Collections.sort(array);
    System.out.println("median : " + (array.get(10/2-1)));
    System.out.println("======================================");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> input = new ArrayList<>();
    for(int i=0;i<10;i++){
      input.add(sc.nextInt());
    }

    findMedian(input);

  }
}
//prob 7은 Exam01_0625에서 완료

