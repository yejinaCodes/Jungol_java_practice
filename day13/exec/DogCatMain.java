package day13.exec;

import day13.VO.Animal;
import day13.VO.Dog;

public class DogCatMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    //upcasting
    Animal x = new Dog();
    x.eat();

    x = new Dog();
    x.eat();

  }
}
