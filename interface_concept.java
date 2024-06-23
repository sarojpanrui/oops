public class interface_concept {
    public static void main(String[] args) {
        queen q=new queen();
        q.move();
    }
}
interface chess{
    void move();
}
class queen implements chess{
    public void move(){
        System.out.println("up,down,left,right(all 4 drains)");
    }
}
class king implements chess{
    public void move(){
        System.out.println("up,down,left,right(by 1)");
    }
}
class rook implements chess{
    public void move(){
        System.out.println("up,down,left,right");
    }
}
