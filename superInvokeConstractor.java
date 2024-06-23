public class superInvokeConstractor {
    public static void main(String[] args) {
        student ob=new student();
        
    }
}
class person{
    person(){
        System.out.println("Person constractor is called...");
    }
}
class student extends person{
    student(){
        super();
        System.out.println("Student constractor is called...");
    }
}
