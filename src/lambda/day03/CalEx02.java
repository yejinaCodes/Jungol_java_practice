package lambda.day03;

public class CalEx02 {
    public static void main(String[] args) {
        //user은 컴퓨터의 덧셈기를 이용하여 2 수를 더하여 결과를 확인합니다.
        Person user = new Person();
        Person.action(Computer :: adder); //static 메소드 adder 참조


        //user은 컴퓨터의 곱셈기(multiply)를 이용하여 두 수를 곱한 결과를 확인합니다.
        Computer com = new Computer();
        user.action(com :: multiply); //::는 '참조하다'라는 뜻, Computer instance method multiply 참조

    }
}
