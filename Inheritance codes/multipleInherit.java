

public class multipleInherit {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.breath();

        cow c=new cow();
        c.eat();
        c.breath();
    }
}
class animal{
    void breath(){
        System.out.println("Breath.....");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking.....");
    }
    
}
class cow extends animal{
    void eat(){
        System.out.println("Eating....");
    } 
}
