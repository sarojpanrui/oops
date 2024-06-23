import java.util.*;
public class array1_d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the elements for array:");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Elements of array is:");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}
