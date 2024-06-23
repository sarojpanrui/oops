public class methodOv {
    public static void main(String[] args) {
        calc v=new calc();
        v.sum();
        v.sum(5);
        v.sum(4,6);
        v.sum(2.0,8.0);
    }
}
class calc{
    void sum(){
        System.out.println("no parameter");
    }
    void sum(int a){
        System.out.println("only one parameter->"+a);
    }
    void sum(int a,int b){
        System.out.println("Sum of two integers->"+(a+b));
    }
    void sum(Double a,Double b){
        System.out.println("Sum of two double is->"+(a+b));
    }
}
