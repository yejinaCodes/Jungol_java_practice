package 배열;

public class prob10 {

  public static void main(String[] args) {

    int a[][] = { {30,30,30,30}, {40,40,40,40}, {50,50,50,50} };
    int b[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
    int c[][] = new int[3][4];

    prob10 pb = new prob10();
    int d[][] = pb.sub(a,b,c);
    pb.prn(d);

  }

  public int[][] sub(int[][] a, int[][] b, int[][] c){
    /* 이곳에 프로그램을 완성하십시오. */
    //System.out.println("\t  배열 c");
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[0].length; j++){
        c[i][j] = a[i][j] - b[i][j];
        //System.out.print(c[i][j] + " ");
      }
      //System.out.println();
    }
    return c;
  }
  public void prn(int[][] d){
    /* 이곳에 프로그램을 완성하십시오. */
    System.out.println("\t  배열 c");
    for(int i=0;i<d.length;i++){
      for(int j=0;j<d[0].length;j++){
        System.out.print(d[i][j] + " ");
      }
      System.out.println();
    }



  }


}

