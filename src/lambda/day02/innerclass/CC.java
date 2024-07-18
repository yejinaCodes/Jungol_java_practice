package lambda.day02.innerclass;

public class CC {

    void useC(){

        class D{
            //인스턴스 필드
            int field1 = 10;
            static int field2 = 20;

            D(){
                System.out.println("D 생성자 실행");
            }

            void method1(int arg){ //final 의 의미를 가지고 있다.
                System.out.println("D - method1 실행");
            }

            static void method2(){ //java 17부터
                System.out.println("D method2 static 실행");
            }

        }

        D d = new D(); //local class
        System.out.println(d.field1);
        //d.method1();

        D.method2();
        System.out.println(D.field2);
    }

}
