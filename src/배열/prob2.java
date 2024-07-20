package 배열;
import java.math.*;

public class prob2 {
  public static int[] generateRandom(){
    System.out.println("<<\t생성된 난수\t>>");
    int[] array = new int[10];
    for(int i=0; i<10;i++){
      int check = ((int)(Math.random()*30+1)); //1부터 30까지의 수
      array[i] = check;
    }
    for(int i=0;i<10;i++){
      System.out.print(array[i] + " ");
    }
    return array;

  }

  public static void getMaxNum(int[] array ){
    int num = 0;
    for(int i = 0; i<10; i++){
      if (array[i] > num){
        num = array[i];
      }
    }
    System.out.println("배열에서 가장 큰 숫자 : " + num);
  }


  public static void main(String[] args) {
    int[] array = generateRandom();
    System.out.println("\n=====================");
    getMaxNum(array);

  }

}

