package 배열;

import java.util.HashSet;
import java.util.Set;

public class prob3 {
  private static void printUniqueNumber(int[] array){
    Set<Integer> tmp = new HashSet<Integer>();
    for(int i=0;i<array.length;i++){
      tmp.add(array[i]);
    }
    System.out.println("<<\t중복되지 않은 숫자\t>>");
    for(Integer num : tmp){
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    int[] sample_array = {3,2,3,5,3,6,7,90,35,66,66,23,12,12};
    printUniqueNumber(sample_array);

  }

}
