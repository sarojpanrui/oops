import java.io.*;
public class buffer_reader {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value" );
        String input=br.readLine();//always take input as string
        int radius=Integer.parseInt(input);//string to int convert
        double radius1=Double.parseDouble(input);
        System.out.println("int value is="+radius);//int value
        System.out.println("double value is="+radius1);//double value
    }
}
