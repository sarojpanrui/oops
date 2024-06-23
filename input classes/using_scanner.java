
import java.util.Scanner;
public class using_scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        String s=sc.nextLine();
        System.out.println("Input Integer is:"+a);
        
        System.out.println("Input String is"+s);
    }
}
