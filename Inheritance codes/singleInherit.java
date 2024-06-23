

public class singleInherit {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.breath();
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
