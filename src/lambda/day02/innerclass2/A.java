package lambda.day02.innerclass2;

public class A {
    //A class의 instance 필드와 메소드
    int field1;
    void method1(){
        System.out.println("A의 메소드1");
    }
    String field3 = "A-field-값";



    //A class의 정적 필드와 메소드
    static int field2;
    static void method2(){}

    //instnace 멤버 클래스
    private class B{
        String field = "B-field-값";
        void method(){
            //A클래스의 인스턴스 필드와 메소드 사용
//            field1 = 10;
//            method1();
//            method2();
//
//            field2 = 20;
            System.out.println("B-method");
        }
        void print(){
            System.out.println(this.field);
            this.method();

            System.out.println(A.this.field1 + " " + A.this.field3);
            A.this.method1(); //바깥 메소드를 호출하고 싶은 경우
        }
        //A의 인스턴스 메소드
        void useB(){
            B b = new B();
            b.print();
        }
    }
    static class C{
        void method(){
            //A의 인스턴스 필드와 메소드 사용 가능?
            field2 = 30;
            method2();

        }

    }
}
