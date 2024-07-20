package day18.wrapperEx;

public class wrapEx01 {
  public static void main(String[] args) {
    //100값을 객체로 생성하기. 박싱(boxing)
    Integer value = 100;  //autoboxing 자동박싱 java1.5부터 제공
    Boolean b1 = true;
    boolean b2 = b1.booleanValue(); //언박싱
    int v = value.intValue(); //언박싱
    int v1 = value; //autoUnboxing

    v = v + 100;
    //재포장(박싱)
    value = v;
    System.out.println(value);

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result1 = num1 + num2;
    System.out.println(result1);

    //객체 값을 비교   equals()로 비교해야 한다.
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);
    System.out.println(num1 + num2);

    //String 문자를 포장객체가 언박싱할때
    String str1 = "10";
    int value2 = Integer.parseInt(str1);
    double value3 = Double.parseDouble(str1);
    byte value4 = Byte.parseByte(str1);
    short value5 = Short.parseShort(str1);
    long value6 = Long.parseLong(str1);
    float value7 = Float.parseFloat(str1);

    //AutoBoxing과 기본타입의 연산과정을 for 100만건 이상으로 성능평가 코드 돌려보기




  }
}