public class abstration {
    public static void main(String[] args) {
        honda ob=new honda();
        ob.run();
    }
}
abstract class bike{
    abstract void run();
}
class honda extends bike{
    void run(){
        System.out.println("Running safely...");
    }
}
