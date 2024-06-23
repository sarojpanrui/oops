
public class multiInherit {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.breath();
        System.out.println("------x------");
        puppy p=new puppy();
        p.bark();
        p.eat();
        p.bark();
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
    void eat(){
        System.out.println("Eating....");
    }
}
class puppy extends dog{
    void sleep(){
        System.out.println("Sleeping.....");
    }
}
