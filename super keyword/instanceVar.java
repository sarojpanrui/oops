//Here is an example of Java code that demonstrates the use of the super 
//keyword to refer to a superclass instance variable:

public class instanceVar {
    public static void main(String[] args) {
        dog d=new dog();
        d.display();
    }    
}
class animal{
    String name="Tiger";
    void display(){
        System.out.println("Name is:"+name);
    }
}
class dog extends animal{
    String name="dog";
    void display(){
        System.out.println("Name is:"+name);
        System.out.println("Name is:"+super.name);
    }
}
