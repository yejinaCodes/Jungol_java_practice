package lambda.day02.innerclass;

public class DD {

    public void method3(int n ){
        //local variable
        int var = 1;

        //local class
        class E{
            void method4(){
                //local variable
                System.out.println("n 값 = " + n);
                //System.out.println("var 값 = " + var);

                //var = 2; //local class에서는 local variable을 수정할 수 없다
            }

        }
        //local 객체 생성
        E e = new E();
        e.method4();

        var = 5;

    }

}
//local 변수를 local class에서 사용할 경우 local variable은 final 특성을 부여한다.
//값을 읽을 수만 있고, 값을 수정할 수 없도록 제한한다.

