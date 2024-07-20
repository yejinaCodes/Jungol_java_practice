package 배열;

public class prob1 {

  public static void holChak(String arrayname, int[] array){
    int hol = 0;
    int chak = 0;
    for(int i=0; i<array.length;i++){
      if(array[i]%2 == 0){
        chak += array[i];
      } else if (array[i]%3 == 0) {
        hol += array[i];
      }
    }
    System.out.printf("( 배열%s )\n", arrayname);
    System.out.println("홀수의 합: " + hol);
    System.out.println("짝수의 합: " + chak);

  }

  public static void main(String[] args) {

    int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
    int[] ib = new int[]{1,2,3,4,5};

    String first_array = "ia";
    String second_array = "ib";

    holChak(first_array, ia);
    holChak(second_array, ib);

  }


}
