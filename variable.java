public class variable {
    public static void main(String[] args) {
        int a=10;
        System.out.println("local variable is="+a);
        concept c=new concept();
        System.out.println("instance variable is="+c.num);
    }
}
class concept{
    int num=50;
}
