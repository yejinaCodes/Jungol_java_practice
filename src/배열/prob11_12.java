package 배열;

import java.util.Scanner;

public class prob11_12 {
  public static boolean equalsArray(int[] a, int[] b) {
    boolean flag = true;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        flag = false;
      }
    }
    return flag;
  }

  private static int[] ascending(int[] a){
    //int[] tmp = new int[10];
    for(int i=0;i<10;i++){
      for(int j=i+1;j<10;j++){
        if(a[i] > a[j]){
          int check = a[j];
          a[j] = a[i];
          a[i] = check;
        }
      }
    }
    return a;
  }


  public static void main(String[] args) {
    //11번
    int[] sample1 = {1,2,3,4,5};
    int[] sample2 = {1,2,3,4,5};
    int[] sample3 = {2,3,5,1,6};
    boolean result11 = equalsArray(sample1, sample2);
    //boolean result11 = equalsArray(sample2, sample3);
    if(result11){
      System.out.println("two arrays equals");
      System.out.println("=====================");
    }else{
      System.out.println("two arrays not-equals");
    }

    //12번
    Scanner sc = new Scanner(System.in);
    int[] tmp = new int[10];
    for(int i=0;i<10;i++){
      tmp[i] = sc.nextInt();
    }
    int[] sortedarray = ascending(tmp);
    System.out.print("리턴값: ");
    for(int i=0;i<10;i++){
      System.out.print(sortedarray[i] + " ");
    }




  }

}
