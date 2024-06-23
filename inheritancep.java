

public class inheritancep {
    public static void main(String[] args) {
        animal a1=new animal();
        a1.eat();
        a1.Breath();
        System.out.println("-------x--------");
        dog d=new dog();
        d.eat();
        d.Breath();
        d.sound();
    }
}
class animal{
    void eat(){
        System.out.println("----Eat----");
    }
    void Breath(){
        System.out.println("----breath----");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("bark");
    }
}
