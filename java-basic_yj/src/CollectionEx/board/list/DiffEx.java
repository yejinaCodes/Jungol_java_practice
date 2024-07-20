package CollectionEx.board.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class DiffEx { //ArrayList와 LinkedList객체 추가 성능평가

  public static void main(String[] args) {
    ArrayList<String> arraylist = new ArrayList<>();
    LinkedList<String> linkedlist = new LinkedList<>();

    //시작 시간과 끝 시간을 저장할 변수 선언
    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for(int i=0;i<10000;i++){
      arraylist.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n", "ArrayList 걸린 시간 : ", (endTime - startTime));

    System.out.println("============================");
    startTime = System.nanoTime();
    for(int i=0;i<10000;i++){
      linkedlist.add(0,String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n", "LinkedList 걸린 시간: ",(endTime - startTime));



  }

}
