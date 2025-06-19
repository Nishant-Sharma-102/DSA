public class class_objects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.tip = 10;
        System.out.println(p1.tip);
        Student s1 = new Student();
        s1.setName("aman");
        System.out.println(s1.name);  
    }
}

class Pen {
    String color;
    int tip;
    int price;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
    // Create another class
    class Student {
        int rollNumber;
        String name;
        int clas;

        void setRollNumber(int newRollno) {
            rollNumber = newRollno;

        }

        void setName(String newName) {
            name = newName;
        }
    }
