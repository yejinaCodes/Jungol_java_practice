package day18;

import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String data1 = "김창완&정수민&김지훈";
    //& tokenizer하여 학생이름을 각각 프린트
    StringTokenizer st = new StringTokenizer(data1, "&");
    int no = 0;
    while(st.hasMoreTokens()){
      String token = st.nextToken();
      no++;
      System.out.println(no + ". " + token);
    }
    System.out.println();
    //2. split을 사용해서 출력
    String[] list = data1.split("&");
    int number = 0;
    for(String str : list){
      number++;
      System.out.println(number + ". " + str);
    }

  }

}
