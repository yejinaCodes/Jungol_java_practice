package 배열;

public class prob8 {

  public static void main(String[] args) {
    int[] sample = {5,4,3,2,1,10,9,8,7,6,15,14,13,12,11,20,19,18,17,16,25,24,23,22,21};
    int check = 0;
    int[][] matrix = new int[5][5];
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        matrix[i][j] = sample[check];
        check++;
      }
    }
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

  }
}
//prob 9는 Exam02_0625에서 이미 완료했음
