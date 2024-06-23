

public class cap_len {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("saroj");
        System.out.println("length="+s.length());
        System.out.println("Capacity is="+s.capacity());

        System.out.println(s.charAt(2));
        s.setCharAt(4, 'o');
        System.out.println(s);
    }
}
