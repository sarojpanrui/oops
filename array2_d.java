import java.util.*;
public class array2_d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[10][10];
        System.out.println("Enter the elements for array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("matrix is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
