public class contractor {
    public static void main(String args[]){
        //parameterised constractor
        student s1=new student("saroj",152);
        System.out.println("---------");  

        //default constractor
        pen p1=new pen();
        p1.setcolor("blue");
        p1.settip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);  
        System.out.println("---------");  
    }
}
//parametarised constractor
class student{
    String name;
    int roll;

    student(String name,int roll){
        System.out.println(name);
        System.out.println(roll);
    }
}
//default constractor
class pen{
    int tip;
    String color;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
       tip=newtip;
    }
}