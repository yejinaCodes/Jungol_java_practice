package stream_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Locale.filter;

//주어진 인수에 대하여 true 또는 false 반환 하는 메서드를 정의한다.
public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n-> n>0; //람다식 검사

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-5));

        List<Integer> numbers = Arrays.asList(-3,2,-1,0,1,2);
        //Predicate 타입으로 정의한 isPositive 를 이용하여 filter 처리
        List<Integer> positiveNumbers = filter(numbers, isPositive);

        //결과 출력
        System.out.println(positiveNumbers);
    }
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filterList = new ArrayList<>();
        for(T item: list){
            if(predicate.test(item)){
                filterList.add(item);
            }
        }
        return filterList;
    }
}