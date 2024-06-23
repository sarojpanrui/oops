import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("1-sum");
        System.out.println("2-sub");
        System.out.println("3-mul");
        System.out.println("4-div");
        
        System.out.println("Enter the a number for operation:");
        int c=sc.nextInt();
        
        switch (c) {
            case 1:
                System.out.println("sum->"+(a+b));
                break;
            case 2:
                System.out.println("sub->"+(a-b));
                break;
            case 3:
                System.out.println("mul->"+(a*b));
                break;
            case 4:
                System.out.println("div->"+(a/b));
                break;
        }
    }
}
