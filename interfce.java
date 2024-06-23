public class interfce {
   public static void main(String[] args) {
        circle c=new circle();
        float a=c.compute(5, 5);
        rectangle r=new rectangle();
        float b=r.compute(5, 6);
        System.out.println("Area of circle is:"+a);
        System.out.println("Area of rectangle is:"+b);
   } 
}
interface area{
    float pi=3.14f;
    float compute(float x,float y);
}
class circle implements area{
    public float compute(float x,float y){
        return pi*x*x;
    }
}
class rectangle implements area{
    public float compute(float x,float y){
        return x*y;
    }
}
