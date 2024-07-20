package CollectionEx.board.tree.TreeMap;

import com.sun.source.tree.Tree;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> treemap = new TreeMap<>();

    //엔트리 저장
    treemap.put("grace", 90);
    treemap.put("yejin", 50);
    treemap.put("tolbang", 40);
    treemap.put("hehe", 88);

    Set<Entry<String, Integer>> entrySet = treemap.entrySet();
    for(Entry<String, Integer> student : entrySet){
      System.out.println(student.getKey() + "---" + student.getValue());

    }
    System.out.println("==================");
    //특정 키 검색하여 값 가져오기. 키의 순서대로 가지고 온다.
    Entry<String, Integer> entry = null;
    entry = treemap.firstEntry();
    System.out.println(entry.getKey() + "------" + entry.getValue());

    entry = treemap.lastEntry();
    System.out.println(entry.getKey() + " ---- " + entry.getValue());

    entry = treemap.lowerEntry("yein");
    System.out.println(entry.getKey() + " ---- " + entry.getValue());

    //내림차순 정렬
    NavigableMap<String, Integer> descStudents = treemap.descendingMap();
    Set<Entry<String,Integer>> descScoresSet = descStudents.entrySet();
    for(Entry<String, Integer> student : descScoresSet){
      System.out.print(student.getKey() + " ---- " + student.getValue() + " ");
    }
    System.out.println("\n");
    System.out.println("=============범위 검색===============");

    //범위 검색 가능함
    NavigableMap<String, Integer> substudent = treemap.subMap("g",true,"y", false);
    for(Entry<String, Integer> submap : substudent.entrySet()){
      System.out.print(submap.getKey()+ " ---- " + submap.getValue() + " ");
    }
    System.out.println("\n");
//
//    System.out.println("=============구간 범위 검색===============");
//
//    //범위 검색 가능함
//    NavigableSet<Integer> subScores = scores.subSet(80, true, 95, false);
//    for(Integer score : subScores){
//      System.out.print(score + " ");
//    }
//    System.out.println("\n");


  }

}
