public class method_overriding {
    public static void main(String[] args) {
        deer d=new deer();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("Eat grass");
    }
}
