package lambda.day03.practice;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ColorMain {

    //Color(int, int, int)처럼 인수가 3개인 생성자의 생성자 참조를 사용하도록 구조화하세요
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Function<Integer,Color>> colorConstructor = (x, y) -> z -> new Color(x,y,z);
        //Color color = new Color(0,1,2);
        Color color = colorConstructor.apply(255, 123).apply(35);

        System.out.println("x= " + color.getX());
        System.out.println("y= " + color.getY());
        System.out.println("z= " + color.getZ());
    }
}
