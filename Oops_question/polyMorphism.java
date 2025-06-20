/*Compile time - method overloading(static)=multiple function with same name
 but different parameters
 * Run Time - method overriding(dynamic)=Parent and child classes both contain the same function
 *  with a different definition
 */

public class polyMorphism {
    public static void main(String[] args) {
       Calculator c1 = new Calculator();
       c1.sum(2, 4); 
       System.out.println();
       c1.sum(1,2,6);
       System.out.println();
       System.out.println(c1.sum((float)1.1,(float)1.2,(float)1.3));
 Deer d1 = new Deer();
         d1.eat();
    }
}

 //method overloding
class Calculator{
    void sum(int a, int b ){
    System.out.println(a+b);
    }
    
  float sum(float a , float b, float c){
    return a+b+c;
     }

    void sum(int a, int b, int c){
        System.out.println((a+b+c));

    } 
}

//Method overriding

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
