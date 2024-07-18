package lambda.day01;

import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOfEvenNumbers = numbers.stream().filter(number->number%2 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEvenNumbers);
    }
}
