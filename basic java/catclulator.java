import java.util.*;
public class catclulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calc x=new calc();
        x.sum(a,b);
        x.sub(a,b);
    }
}
class calc{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }

}
