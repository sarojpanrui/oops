public class abstration1 {
    public static void main(String[] args) {
        shape ob1=new circle();
        shape ob2=new rectangle();
        ob1.draw();
        ob2.draw();
    }
}
abstract class shape{
    abstract void draw();
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing circle...");
    }
}
class rectangle extends shape{
    void draw(){
        System.out.println("Drawing rectangle...");
    }
}
