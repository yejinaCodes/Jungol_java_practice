package lambda.ex;

public class Example01 {
    //Function interface 작성하시오
    //Single Abstract Method (SAM)
    //함수형 인터페이스: 추상메소드를 가지고 있는 단일 기능을 선언한다. 선언한 구조를 구현 component
    //원하는 조작을 그때그때마다 결과값을 확인하고자. 재사용해서 쓸 필요가 없다.
    @FunctionalInterface
    interface Function{
        double apply(double x, double y);
    }

    public static double calc(Function function){
        double x = 30;
        double y = 3;
        return function.apply(x,y);
    }

    public static void main(String[] args) {
        double result = calc((x,y)-> (x/y));
        System.out.println("result = " + result);
    }
}
