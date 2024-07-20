package 배열;

public class prob5 {
  private static int getValue(int[] values, boolean isMax){
    int tmp;
    if(isMax){
      //최대값 return
      tmp = 0;
      for(int i=0;i<values.length;i++){
        if(values[i]>tmp){
          tmp = values[i];
        }
      }
    }else{
      //최솟값 return
      tmp = Integer.MAX_VALUE;
      for(int i=0;i<values.length;i++){
        if(values[i]<tmp){
          tmp = values[i];
        }
      }
    }
    return tmp;
  }

  public static void main(String[] args) {
    int[] sample_array = {1,2,3,4,5,6,7,8,9,10};
    boolean check = true;
    int result = getValue(sample_array, check);
    System.out.println(result);
  }
}
