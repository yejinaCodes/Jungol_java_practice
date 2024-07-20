package day18.objecEx;

class MyObject implements Cloneable {
  private String name;
  private int age;

  @Override
  //부모의 clone을 overriding하겠다는 거임.
  protected MyObject clone() throws CloneNotSupportedException {
    try{
      return (MyObject) super.clone(); //내 타입으로 downCasting해서 clone()을 접근할 수 있다.
    }catch(CloneNotSupportedException e){
      return null;
    }

  }
}
public class ObjectEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    MyObject myObject = new MyObject();
    System.out.println(myObject.toString());  //myObject 객체의 자신의 정보를 문자열로 반환해준다.
    MyObject copyObject = myObject.clone(); //clone해보기
    System.out.println(myObject);
    System.out.println(copyObject);
  }
}