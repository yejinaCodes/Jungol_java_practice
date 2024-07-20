package day13.exec;

import day13.VO.Animal;
import day13.VO.Cat;
import day13.VO.Dog;

public class PolyMethodTest {

  public static void main(String[] args) {
    Dog d = new Dog();
    //display(d);
    Cat cat = new Cat();
    //display(cat);
    Animal[] animals = new Animal[2];
    animals[0] = d;
    animals[1] = cat;
    display1(animals);
  }
  public static void display(Animal animal){
    animal.eat();
    if(animal instanceof Cat){ //만약에 cat일 경우 //instanceof는 객체 타입을 검사하는 연산자임.
      ((Cat) animal).night(); //downcating해서 cat의 night를 실행
    }
  }
  public static void display1(Animal[] animals){
    for(Animal ani : animals){
      ani.eat();
      if(ani instanceof Cat){ //만약에 cat일 경우 //instanceof는 객체 타입을 검사하는 연산자임.
        ((Cat) ani).night(); //downcating해서 cat의 night를 실행
      }
    }

  }

}
