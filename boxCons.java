public class boxCons {
    public static void main(String args[]){
        Box b1=new Box();
        b1.volume();
    }
}
class Box{
    double depth;
    double height;
    double width;
    Box(){
        width=10;
        height=5;
        depth=7;
    }
    void volume(){
        System.out.println("volume is:");
        System.out.println(width*depth*height);
    }
}
