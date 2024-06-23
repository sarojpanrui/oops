import java.io.*;
public class buffInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int a=Integer.parseInt(br.readLine());
        System.out.println(a);
        System.out.println("Enter a String:");
        String s=br.readLine();
        System.out.println(s);
    }
}
