public class getter_setter{
    public static void main(String args[]){
        pen p1=new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(10);
        System.out.println(p1.gettip());
        System.out.println("---------");  
    }
}
class pen{
    private int tip;
    private String color;
    
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    

}