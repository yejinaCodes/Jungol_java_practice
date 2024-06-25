package 클래스작성방법;

public class PlayBird {

  public static void main(String s[]){
    Duck duck = new Duck();
    duck.setName("꽥꽥이");
    duck.fly();
    duck.sing();
    System.out.println(duck.toString());

    Sparrow sparrow = new Sparrow();
    sparrow.setName("짹짹");
    sparrow.fly();
    sparrow.sing();
    System.out.println(sparrow.toString());


  }


}
