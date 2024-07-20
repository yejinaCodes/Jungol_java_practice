package CSstudy;

import java.util.ArrayList;
import java.util.List;

public class Arrayexample {
  public static <list> void main(String[] args) {
    int[] test = new int[5];
    for(int i=0; i<5; i++){
      test[i] = i+1;
    }
    System.out.print("처음 배열: ");
    for(int i: test){
      System.out.print(i + " ");
    }
    //새로운 배열 사용
    int[] test2 = new int[4];
    int toBeDeletedIndex = 2;
    for(int i=0;i<test2.length;i++){
      if(i==toBeDeletedIndex){
        continue;
      }
      test2[i] = test[i];
    }
    System.out.print("\n" + "삭제 후 배열: ");
    for(int i: test2){
      System.out.print(i + " ");
    }
    //ArrayList사용
    List<Integer> l = new ArrayList<>();
    l.add(10);
    l.add(33);
    l.add(13);
    System.out.printf("\n" + "처음 배열: ");
    for(int i: l){
      System.out.print(i + " ");
    }
    l.remove(1);
    System.out.printf("\n" + "삭제 후 배열: ");
    for(int i: l){
      System.out.print(i + " ");
    }
  }
}
