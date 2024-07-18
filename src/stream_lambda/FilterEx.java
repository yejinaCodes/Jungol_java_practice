package stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("김예진");
        list.add("김예진");
        list.add("김예진");
        list.add("김예진");
        list.add("한미경");

        //중복요소를 제거해 주세요
        list.stream().distinct().forEach(yejins -> System.out.println(yejins));
        list.stream().distinct().forEach(System.out::println);

        System.out.println("=============================");
        list.stream().filter(yejins -> yejins.startsWith("한"))
                .forEach(kim -> System.out.println(kim));
    }
}
