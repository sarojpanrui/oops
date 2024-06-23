import java.io.*;
public class using_bufferclass {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        System.out.println(a);
        String s=br.readLine();
        System.out.println("Input String is:"+s);
    }
}
