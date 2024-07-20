package 클래스작성방법;

public class q_3PlayBird {

  public static void main(String s[]){
    q_3_Duck duck = new q_3_Duck();
    duck.setName("꽥꽥이");
    duck.fly();
    duck.sing();
    System.out.println(duck.toString());

    q_3Sparrow sparrow = new q_3Sparrow();
    sparrow.setName("짹짹");
    sparrow.fly();
    sparrow.sing();
    System.out.println(sparrow.toString());


  }


}
