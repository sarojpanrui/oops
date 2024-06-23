

public class invokeMethod {
    public static void main(String[] args) {
        dog d=new dog();
        d.display();
    }
}
class animal{
    String name="Tiger";
    void display(){
        System.out.println(name);
        System.out.println("Animal class");
    }
}
class dog extends animal{
    String name="dog";
    void display(){
        System.out.println(name);
        System.out.println("Dog class");
        
        super.display();
    }
}
