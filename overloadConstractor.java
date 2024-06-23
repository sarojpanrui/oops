public class overloadConstractor {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(5);
        Box b3=new Box(5,7,8);
        b1.volume();
        b2.volume();
        b3.volume();
    }
}
class Box{
    double width;
    double length;
    double height;
    Box(){
        width=15;
        length=7;
        height=5;
    }
    Box(double d){
        width=height=length=d;
    }
    Box(int l,int d,int h){
        this.height=h;
        this.length=l;
        this.width=d;
    }
    void volume(){
        System.out.println("volume is:");
        System.out.println(height*width*length);
    }
}