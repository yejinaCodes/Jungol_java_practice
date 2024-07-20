package day18;

public class StringBuilderEx {

  public static void main(String[] args) {
    String data = new StringBuilder().append("abc")
        .append('k').insert(0, "ABC").delete(0,1).toString(); //완성된 문자를 data에 담아줘야 한다.
    System.out.println(data);



  }
}
