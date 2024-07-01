package day13.VO;

public class Cat extends Animal{
  public Cat(){
    super();
  }
  public void eat(){
    //int age = super.age;
    System.out.println("Cat eat!");
    //System.out.println(age + "Cat eat!");
  }

  public void night(){
    System.out.println("밤에는 고양이 눈이 무섭다. ");
  }
}
