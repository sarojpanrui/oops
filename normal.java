class Box{
    int length;
    int width;
    int height;
    void volume(){
        int vol=length*height*width;
        System.out.println("Volume is:"+vol);
    }
}
class normal{
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box();

        b1.length=10;
        b1.width=5;
        b1.height=7;

        b2.length=10;
        b2.width=5;
        b2.height=7;

        b1.volume();
        b2.volume();
    }
}