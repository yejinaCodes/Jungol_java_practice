package lambda.day02.innerclass;
//중첩 클래스 만들기
public class A {
    //인스턴스 멤버 클래스
    class B{
        int field = 10;


        static void method1(){
            System.out.println("B-method1 실행");
        }

        static void method2(){
            System.out.println("B-method2 실행");
        }

        void userB(){
            B b = new B();
            System.out.println(b.field);
            b.method1();

            //System.out.println(B.field2);
            B.method2();
        }



    }



    //인스턴스 필드 값으로 B객체 대입
    B field = new B();

    //생성자
    A(){
        B b = new B();
    }
    //인스턴스 메소드
    void method(){
        B b = new B();

    }
}
