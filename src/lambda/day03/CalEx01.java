package lambda.day03;
//사용자로부터 2개의 정수를 받아서 데이터를 저장하고 있는 메소드
//Calculable 타입을 전달 받아 Calculable 인터페이스의 calculator
//데이터를 처리하는 메소드이다.
//action()
//action을 이용하여 입력받은 두개의 정수를 더하기, 곱하기 연산을 하는 람다식 작성
//그 결과를 바로바로 출력하여 확인
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class CalEx01 {
//    static Scanner input = new Scanner(System.in);
//    public static void action(Calculable calculable){
//        //String data = processData((BufferedReader br) -> br.readLine());
//
//        int x = input.nextInt();
//        int y = input.nextInt();
//
//        calculable.calculate(x,y);
//    }
//    public static String processData() throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        return br.readLine();
//
//    }
    public static void main(String[] args) {
//        action(
//                (x,y)->{
//                    int result = x + y;
//                    System.out.println(result);
//                }
//
//        );
//        action(
//                (x,y)->{
//                    int result = x * y;
//                    System.out.println(result);
//                }
//        );
        Person user = new Person();
        user.action(
                (x,y) -> {
                    int result = x + y;
                    return result;
                }

        );
        user.action((x,y)->(x+y));
        user.action((x,y)->sum(x,y));

    }
    public static int sum(int x, int y){
        return (x+y+0);
    }
}
//실행 어라운드 패턴
