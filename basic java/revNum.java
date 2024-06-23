

public class revNum {
    public static void main(String[] args) {
        int n=547,sum=0;
        int num=n;
        while(n != 0){
            int rem=n % 10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println("Number is:"+num);
        System.out.println("Reverse numver is: "+sum);
        if(sum==num){
            System.out.println("pallindrome number");
        }
        else{
            System.out.println("not pallindrome number");
        }
    }
}
