import java.sql.Array;
import java.util.*;
public class sample {
//  static int getCapacity(List<String> list) throws Exception{
//    Field field = ArrayList.class.getDeclaredField("elementData");
//    field.setAccessible(true);
//    return ((Object[]) field.get(list)).length;
//  }

  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    //System.out.println(getCapacity(l));

    List<String> l2 = new ArrayList<>(100);
    System.out.println(l2.size());
  }
}
