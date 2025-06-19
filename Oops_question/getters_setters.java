public class getters_setters {
    public static void main(String[] args) {
         Pen p1 =  new Pen();
         p1.setTip(5);
         System.out.println(p1.getTip());
    }
}

class Pen{
    String color;
    private int tip;
    void setColor(String color){
        this.color =  color;
    }int getTip(){
        return this.tip;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    
}
//This keyword is used to refer 
//to the current object