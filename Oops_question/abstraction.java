/*
 * Hiding all the unnnecessary details and showing only the 
 * imortant parts to the user
 * 
 * -- cannot create an instance of abstract class
 * --can have abstranct/non-abstract mehthods
 * --can have constructors
 */
public class abstraction {
     public static void main(String[] args) {
         Horse h = new Horse();
         h.walk();
         h.eat();
         Dog d = new Dog();
         d.walk();
         d.eat();
     }
}
abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
   void walk(){
    System.out.println("walks on four legs");
  }
}
class Dog extends Animal{
    void walk(){
        System.out.println("walks on two legs");
    }

}
