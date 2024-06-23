import java.util.*;
class result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your percentage:");
        int a=sc.nextInt();
        if(a>90){
            System.out.println("Greade A");
        }
        if(a>80 && a<=89){
            System.out.println("Greade B");
        }
        if(a>70 && a<=79){
            System.out.println("Greade C");
        }
        if(a>60 && a<=69){
            System.out.println("Greade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}