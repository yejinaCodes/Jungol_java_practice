package lambda.day01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx04 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Adam", "Eve", "Jane");

        /*
        Collections.sort(names, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });
        for(String name : names){
            System.out.println(name);
        }
         */

        Collections.sort(names, (a, b) -> a.compareTo(b));
        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = 0;
        for(int number : integers){
            //list collection의 값중 모든 짝수의 제곱의 합을 구하세요
            if(number%2 == 0){
                int square = number * number;
                sum+= square;
            }
            System.out.println(sum);
        }
        //병렬처리하기. multi core process (multi cpu)에서 작업하는 것처럼의 효과를 얻을 수 있다.
        //고성능 어플리케이션에서 효과적으로 값을 받을 수 있다.
        //react, vue, vanillaj 등에서 사용됨.

        int sum1 = integers.parallelStream().filter(number -> number%2 == 0)
                .mapToInt(num -> num * num)
                .sum();
        System.out.println(sum1);
    }
}