//package lambda.day02;
//
//public class LambdaEx01 {
//    public static void main(String[] args) {
//        action(
//                (x,y)->{
//                    int result = x + y;
//                    System.out.println(result);
//                }
//        );
//        //lambda는 인터페이스의 익명 구현 객체
//        //action메소드는 람다식을 이용해서 내부 데이터를 처리한느 처리부이다.
//        action(
//                (x,y) -> {
//                    int result = x * y;
//                    System.out.println(result);
//                }
//        );
//
//    }
//    public static void action(Calculable calculable){
//
//    }
//}
