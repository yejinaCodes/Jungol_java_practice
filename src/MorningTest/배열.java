package MorningTest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 배열 {
  public static void nu_6(){
    System.out.println("6번) array.length = " + 3);
    System.out.println("6번) array[2].length = " + 5);
  }
  public static void nu_7(){
      int[] array = {1,5,3,8,2};
      int tmp = array[0];
      for(int i=1;i<array.length;i++){
        if (array[i] > tmp){
          tmp = array[i];
        }
      }
    System.out.println("7번) 해당 배열의 최대 값은 = " + tmp);
  }
  public static void nu_8(){
    int sum = 0;
    int entire_element = 0;
      int[][] array = {
          {95, 86},
          {83, 92, 96},
          {78, 83, 93, 87, 88}
      };
      for(int i=0; i<array.length;i++){
        entire_element += array[i].length;
        for(int j=0; j<array[i].length; j++){
          sum += array[i][j];
        }
      }
    System.out.println(entire_element);
    System.out.println("8번) 전체 합 = " + sum);
    System.out.println("8번) 전체 평균 = " + (double)sum/entire_element);

  }
  public static void nu_9() {
    Scanner sc = new Scanner(System.in);

    boolean flag = true;
    int studentnum = 0;
    List<Integer> scores = new ArrayList<>();

    while (flag) {

      System.out.println("---------------------------------------");
      System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("---------------------------------------");

      System.out.print("선택> ");
      int menu = sc.nextInt();
//      List<Integer> scores = new ArrayList<>();

      if(menu < 1 || menu > 5){
        System.out.println("1~ 5 메뉴만 지원 가능합니다.");
      }
      else if(menu == 1){
        System.out.print("학생수> ");
        studentnum = sc.nextInt();
      }
      else if(menu == 2){
        for(int i=0; i<studentnum; i++){
          System.out.printf("scores[%d]> ", i);
          scores.add(sc.nextInt());
        }
      }
      else if(menu == 3){
        for(int i=0; i<studentnum; i++){
          System.out.printf("scores[%d]> ", i);
          int tmp = scores.get(i);
          System.out.print(tmp + "\n");
        }
      }
      else if(menu == 4){
        //최고 점수
        int highest_score = 0;
        int sum = 0;
        for(int i=0; i<studentnum; i++){
          sum += scores.get(i);
          if (scores.get(i) > highest_score){
            highest_score = scores.get(i);
          }
        }
        System.out.println("최고 점수: " + highest_score);
        System.out.printf("평균 점수:  %.1f\n", (float)sum/studentnum);
      }
      else if(menu == 5){
      flag = false;
      }
    }
  }
//      switch (menu) {
//        case 1:
//          System.out.print("학생수> ");
//          int num_stu = sc.nextInt();
//          scores = new ArrayList<>(num_stu);
//          //scores = new int[num_stu];
//        case 2:
//          for (int i = 0; i < scores.size(); i++) {
//            System.out.printf("scores[%d]> ", i);
//            scores.add(sc.nextInt());
//          }
//        case 3:
//          for (int i = 0; i < scores.size(); i++) {
//            System.out.printf("scores[%d]> ", i);
//            System.out.println(scores.get(i));
//          }
//        case 4:
//          int tmp = 0;
//          int sum = 0;
//          for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//            if (scores[i] > tmp) {
//              tmp = scores[i];
//            }
//            System.out.println("최고 점수: " + tmp);
//            System.out.println("평균 점수: " + (double) sum / scores.size());
//          }
//        case 5:
//          flag = false;
//          System.out.println("프로그램 종료");
//      }
//    }


  public static void main(String[] args) {

    //nu_6();
    //nu_7();
    //nu_8();
    nu_9();


  }
  }


