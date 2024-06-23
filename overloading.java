public class overloading {
    public static void main(String[] args) {
        overloadDemo ob=new overloadDemo();
        ob.test();
        ob.test(5,6);
        ob.test(8.369);
    }
}
class overloadDemo{
    void test(){
        System.out.println("No parameter!!!");
    }
    void test(int a,int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void test(double d){
        System.out.println("d="+d);
    }
}
