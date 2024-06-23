
public class invokeConstractor {
    public static void main(String[] args) {
        person p=new person();
        
    }
}
class student{
    student(){
        System.out.println("Student class");
    }
}
class person extends student{
    person(){
        super();
        System.out.println("Person class");
    }
}
