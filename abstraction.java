public class abstraction {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);
        System.out.println("-----------");
        chicken c1=new chicken();
        c1.eat();
        c1.walk();
    }
}
abstract class animal{
    String color;
    animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
    void changecolor(){
        color="dark brown";
    }
}
class chicken  extends animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
    void changecolor(){
        color="white";
    }
}