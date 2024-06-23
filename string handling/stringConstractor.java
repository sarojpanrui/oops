

public class stringConstractor {
    public static void main(String[] args) {
        char c[]={'J','A','V','A'};
        String s1=new String(c);
        System.out.println(s1);

        byte ascii[]={65,66,67,68,69};
        String s2=new String(ascii);
        System.out.println(s2);
    }
}

