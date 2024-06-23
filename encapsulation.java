public class encapsulation {
    public static void main(String args[]){
        pen p1=new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(10);
        System.out.println(p1.gettip());
        System.out.println("---------");

        student s1=new student();
        s1.setname("saroj");
        System.out.println(s1.name);
        s1.setroll(152);
        System.out.println(s1.roll);
        System.out.println("---------");
    }
}
/*encapsulation is defined as the 
wrapping up of data and mathod under a single unit*/
class pen{
    int tip;
    String color;

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
class student{
    String name;
    int roll;
     
    void setname(String newname){
        name=newname;
    }
    void setroll(int newroll){
        roll=newroll;
    }
    String getname(){
        return this.name;
    }
    int getroll(){
        return this.roll;
    }
}
