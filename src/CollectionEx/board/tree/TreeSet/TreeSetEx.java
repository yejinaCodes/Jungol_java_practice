package CollectionEx.board.tree.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {
    //랜덤 학생 점수를 입력하고 이를 treeset구조에 저장 관리하기
    TreeSet<Integer> scores = new TreeSet<>();

    //학생 점수를 저장함과 동시에 정렬완성

    //학생 점수를 저장
    scores.add(88);
    scores.add(99);
    scores.add(54);
    scores.add(33);
    scores.add(14);

    //정렬된 점수를 하나씩 가져오기. enhanced for 이용하여 출력하기
    System.out.println("=============오름차순 정렬===============");
    for(Integer score : scores){
      System.out.print(score + " ");
    }
    System.out.println();
    System.out.println("최저 점수: " + scores.first());
    System.out.println("최저 점수: " + scores.last());
    System.out.println("95점 아래 점수: : " + scores.lower(95));
    System.out.println("95점 위의 점수: : " + scores.higher(95));

    System.out.println("=============내림차순 정렬===============");
    //desc(내림차순) 정렬
    NavigableSet<Integer> descScores = scores.descendingSet();
    for(Integer score : descScores){
      System.out.print(score + " ");
    }
    System.out.println("\n");
    System.out.println("=============범위 검색===============");

    //범위 검색 가능함
    NavigableSet<Integer> rangeScores = scores.tailSet(80, true);
    for(Integer score : rangeScores){
      System.out.print(score + " ");
    }
    System.out.println("\n");

    System.out.println("=============구간 범위 검색===============");

    //범위 검색 가능함
    NavigableSet<Integer> subScores = scores.subSet(80, true, 95, false);
    for(Integer score : subScores){
      System.out.print(score + " ");
    }
    System.out.println("\n");




  }

}
