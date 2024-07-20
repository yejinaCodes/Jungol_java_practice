package day14.Inheritance.sec09.exam02;

import java.util.Spliterator;

public abstract class Animal {

  //메소드 선언
  Animal(){};
  public Animal(Animal animal){
    System.out.println("소리 낸다.");
  }

  //추상 메소드 선언
  abstract public void sound();

}