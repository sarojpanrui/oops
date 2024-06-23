public class constOv {
    public static void main(String[] args) {
        sum s1=new sum();
        sum s2=new sum(5);
        sum s3=new sum(5,15);
    }
}
class sum{
    sum(){
        System.out.println("no parameter");
    }
    sum(int a){
        System.out.println("only one parameter->"+a);
    }
    sum(int a,int b){
        System.out.println("sum of two integers->"+(a+b));
    }
}
