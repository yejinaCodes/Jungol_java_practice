package lambda.day03;
//Person 클래스가 계산기를 이용해서 계산을 한다.
public class Person {
    public static void action(Calculable calculable){

        int x = 10;
        int y = 20;

        int result = calculable.calculate(x,y);
        System.out.println(result);
    }
}
