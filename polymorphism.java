public class polymorphism {
    public static void main(String[] args) {
        calculator cal=new calculator();
        System.out.println(cal.sum(5, 5));
        System.out.println(cal.sum((float)5.5, (float)5.5));
        System.out.println(cal.sum(5, 5,5));
    }
}
//Method overloading
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
