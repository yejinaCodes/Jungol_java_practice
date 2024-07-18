package lambda.day01;
/*

 */

public class LambdaEx02 {
    //1
    @FunctionalInterface
    interface MathOperation{
        int operate(int a, int b);
    }
    @FunctionalInterface
    interface StringOperation{
        int getLength(String a);
    }
    @FunctionalInterface
    interface ArrayOperation{
        int calculateSum(int[] numbers);

    }
    public static void main(String[] args) {
        //2. 두 정수를 받아 그 합을 반환하는 람다식 작성
        MathOperation addition = (a,b)->a+b;

        //StringOperation stringlen = (a,b)->a+b;

        //3
        int result = addition.operate(5,3);
        System.out.println("Result = " + result);

        //4.문자열을 받아 그 길이를 반환하는 람다 표현식을 작성하시오
        StringOperation length = str->str.length();
        int result1 = length.getLength("Hello lambda");
        System.out.println("Length= " + result1);

        //정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식 작성 ArrayOperation
        ArrayOperation evenSum = numbers -> {
            int sum = 0;
            for(int num : numbers){
                if(num%2 == 0)  sum += num;
            }
            return sum;
        };
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int result2 = evenSum.calculateSum(array);
        System.out.println("result = " + result2);
    }
}
