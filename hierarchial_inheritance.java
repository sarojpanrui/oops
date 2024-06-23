public class hierarchial_inheritance {
    public static void main(String[] args) {
        bird b1=new bird();
        b1.eat();
        b1.breath();
    }
}
class animal{
    String color;

   
    void eat(){
        System.out.println("Eat");
    }
    void breath(){
        System.out.println("Breath");
    }
}

//hierarchial inheritance
class fish extends animal{
    void swim(){
        System.out.println("swim");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}

