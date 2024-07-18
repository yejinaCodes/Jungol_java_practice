package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMain {
    //Arrays.asList() 이용하여 김종국, 90점  박수희, 75점   김지영, 88점

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("김종국", 90), new Student("박수희", 75), new Student("김지영", 88));

        //3명의 학생의 score 평균을 구하세요
        //student 는 collection이다.
        //students.stream();

        //1. student 객체를 요소로 가지는 컬렉션 (students)에서 Student 스트림을 얻는다.
        Stream<Student> studentStream = students.stream();
        //2. studentStream(중간처리): 학생 객체를 점수(score)로 매핑
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        //3. 최종 처리(평균 점수)
        //average method = 연산자, 요소들의 평균값을 계산한다.
        double avg = scoreStream.average().getAsDouble();
        double avg1 = students.stream().mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        //students에 저장되어 있는 학생들의 정보를 출력해 주세요.
        students.forEach(System.out::println);

    }


}
