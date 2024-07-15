import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx03 {
    /*
    1.
     */
    @FunctionalInterface
    interface FindMax{
        //1. getMax()를 사용하여 FindMax interface를 생성하기
        int getMax(ArrayList<Integer> numbers);
        //int getMax(List<Integer> numbers);
    }

    public static void main(String[] args) {
        //2.최대값을 찾는 람다식 구현하기
        //FindMax type의 instance인 findMx 선언하기
        FindMax findMx = numbers ->{
            int max = Integer.MIN_VALUE;
            //3. 최대값 업데이트
            for(int num : numbers){
                if(num > max)   max = num;
            }
            return max;
        };
        //정수 리스트 생성
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 22, 40, 12, 4, 19, 59, 506));
        //List<Integer> numberList = new ArrayList<>();
        //numberList.add()
        System.out.println(findMx.getMax(list));

    }
}