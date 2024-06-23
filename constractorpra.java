public class constractorpra {
    public static void main(String[] args) {
        room r1=new room(5, 5);
        System.out.println(r1.area());
    }
}
class room{
    //class properties
    int length;
    int width;
    //constractor
    room(int l,int w){
        length=l;
        width=w;
    }
    //method
    int area(){
        return length*width;
    }

}
