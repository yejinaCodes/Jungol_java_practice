package CollectionEx.board.MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();

    //객체 저장
    map.put(1, "yejin");
    map.put(2, "grace");
    map.put(3, "Talbang");
    map.put(4, "poozy");
    map.put(5, "doggie");

    System.out.println(map.size());
    System.out.println();
    System.out.println("==========================");

    //키를 이용하여 값을 가져오기
    Integer key = 1;
    String value = map.get(1);
    System.out.println(value);

    //key set collection을 이용하여 반복자를 통해 키와 값을 가지고 오기
    Set<Integer> keyset = map.keySet();
    Iterator<Integer> keyIterator = keyset.iterator(); //iterator를 달았음

    while(keyIterator.hasNext()){
      Integer key1 = keyIterator.next();
      String value1 = map.get(key1);
      System.out.println("key: " + key1 + "\t" + "value: " + value1);
    }

    map.remove(1);
    map.remove(2, "grace");

    System.out.println();
    System.out.println("=================EntrySet사용===========");

    //entry set collection으로 반복해서 키와 값을 가지고 오기
    Set<Entry<Integer, String>> entrySet = map.entrySet();
    Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();

    while(entryIterator.hasNext()){
      Entry<Integer, String> entry = entryIterator.next();
      Integer key2 = entry.getKey();
      String value2 = entry.getValue();
      System.out.println("key: " + key2 + "\t" + "value: " + value2);
    }
  }
}
