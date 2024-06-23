public class overriding {
    public static void main(String[] args) {
        bike b=new bike();
        b.run();
        car c=new car();
        c.run();
    }
}
class car{
    void run(){
        System.out.println("car is running...");
    }
}
class bike{
    void run(){
        System.out.println("bike is running...");
    }
}
