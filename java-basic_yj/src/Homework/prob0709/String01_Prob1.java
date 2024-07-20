package Homework.prob0709;

public class String01_Prob1 {

  public static void main(String[] args) {
    String01_Prob1 prob1 = new String01_Prob1();

    System.out.println( prob1.leftPad("SSG", 6, '#') );
    System.out.println( prob1.leftPad("SSG", 5, '$') );
    System.out.println( prob1.leftPad("SSG", 2, '&') );

  }
  public String leftPad(String str, int size, char padChar) {
    if(str.length() >= size){
      return str;
    }else{
      int tmp = size - str.length();
      String tmp_str = "";
      for(int i=0;i<tmp;i++){
        tmp_str += padChar;
      }
      tmp_str += str;
      return tmp_str;
    }
  }
}

