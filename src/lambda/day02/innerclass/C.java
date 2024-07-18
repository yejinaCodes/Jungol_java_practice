package lambda.day02.innerclass;
//local class: 생성자나 메소드 안에서 생성되는 클래스
public class C {
    //1방법: constructor 사용
    C(){
        class D{}

        D d = new D();
    }
    //2방법: 메소드 사용
    void method(){

        class D{}

        D d = new D();


    }



}
