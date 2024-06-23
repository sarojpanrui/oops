import java.io.*;
public class console {
    public static void main(String[] args) {
        String name=System.console().readLine();
        System.out.println("Name is="+name);
        String n=System.console().readLine();
        int num=Integer.parseInt(n);
        System.out.println("Number is="+num);
    
    }
}
