
public class swap_arith {
    public static void main(String[] args) {
        int a=7,b=5;
        System.out.println("-----before swap-----");
        System.out.println("a="+a);
        System.out.println("b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("------After swap-----");
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    }
}
