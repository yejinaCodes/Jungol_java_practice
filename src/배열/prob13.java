package 배열;

public class prob13 {
  private static String reverseString(char[] s, int start, int end){
    String tmp = "";
    //앞
    for(int i=0;i<start;i++){
      tmp += (s[i]);
    }
    for(int i=end; i>=start; i--) {
      tmp += s[i];
    }
    //뒤
    for(int i=end+1;i<s.length;i++){
      tmp += s[i];
      //System.out.println(tmp);
    }
    return tmp;
  }
  public static void main(String[] args) {
    char[] input = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
//    int start = 0;
//    int end = 3;
//    int start = 4;
//    int end = 7;

//    int start = 8;
//    int end = 10;

    int start = 0;
    int end = 10;
    String result = reverseString(input, start, end);
    System.out.println(result);
  }
}
