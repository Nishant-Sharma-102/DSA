/*inheritance is when properties & methods
 of base class are passed on to a derived class/* */

import java.nio.channels.Pipe.SourceChannel;

public class inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.swim();
    Dog d1 = new Dog();
    d1.eat();
    }
}
//Base class or parent class
class Animal{
  String name;
  String color;
  void eat(){
    System.out.println("eats");
  }
  void run(){
    System.out.println("runs very fast");
  }

}

//subclass or child class
class Fish extends Animal{
 void swim(){
    System.out.println("swims very fast");
 }
 }

/*
 * inheritance type
 * 1.single level
 * 2.multi level
 * 3.hierarchial 
 * 4.hybrid 
 */

 //multi level
class Dog extends Fish{
    void leg(){
        System.out.println("has four legs");
    }
}

