package lambda.day02.innerclass;

public class ABEx {
    public static void main(String[] args) {
        //A 객체 생성
        A a = new A();

        A.B b = a.new B();
    }
}
