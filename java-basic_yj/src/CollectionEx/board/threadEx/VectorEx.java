package CollectionEx.board.threadEx;

import CollectionEx.board.board.Board;
import java.util.ArrayList;

public class VectorEx{
  //vector collection
  public static void main(String[] args) {
    ArrayList<Board> list = new ArrayList<>();

    Thread threadA = new Thread(){
      @Override
      public void run() {
        for(int i=1;i<=1000; i++){
          list.add(new Board("제목 " + i, "ssg " + i, "내용" + i ));
        }
      }
    };
    Thread threadB = new Thread(){
      @Override
      public void run() {
        for(int i=1001 ;i<=2000; i++){
          list.add(new Board("제목 " + i, "ssg " + i, "내용" + i ));
        }
      }
    };

    //thread 실행
    threadA.start();
    threadB.start();

    try{
      threadA.join();
      threadB.join();
    }catch(Exception e){

    }
    int size = list.size();
    System.out.println(size);
    for(Board board : list){
      System.out.println(board.getSubject());
    }
  }
}
