public class superInvokeMethod {
    public static void main(String[] args) {
        student s1=new student();
        s1.display();
    }
}
class person{
   void message(){
        System.out.println("class person...");
   }
}
class student extends person{
    void message(){
        System.out.println("class student...");
    }
    void display(){
        message();
        super.message();
    }
}
