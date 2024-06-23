

public class factorial {
        public static void main(String[] args) {
            facto f=new facto();
            System.out.println(f.fact(5));
     }
}
class facto{
    public int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

}
