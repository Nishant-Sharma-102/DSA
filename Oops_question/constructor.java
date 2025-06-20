//constructor is a special method which is invoked automaticaly at object creation time

//constructor`s name as class name.

//constructor has to return type vale(not even void)

//contructor are called only at once at object creation time

//memory allocation happend when constructor is called

//types of constructor 
//parameterized 
//non-parameterized
//copy 


public class constructor {
    public static void main(String[] args) {
       Student s1 = new Student("nippo");
       System.out.println(s1.name);

        
    }
}
 class Student {
    String name;
    int age;
 
 Student(){
    System.out.println("non-parameterized const called");
 }
 Student (String name){
    this.name = name;
    System.out.println("parameterized const");
 }
 //copy const is whhen we use property of s1 in s2;
 //s2=copy(s1) is copy constructer
}


//deconstructor is in java called garbage collector
//in java aleady available deconstructor is called garbage collector
