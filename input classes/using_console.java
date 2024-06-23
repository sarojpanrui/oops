

public class using_console {
    public static void main(String[] args) {
        String s=System.console().readLine();
        System.out.println(s);
        int a=Integer.parseInt(System.console().readLine());
        System.out.println(a);
    }
}
