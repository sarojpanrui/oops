class oops1{
    public static void main(String args[]){
        pen p1=new pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(10);
        System.out.println(p1.tip);
        System.out.println("---------");

        student s1=new student();
        s1.setname("saroj");
        System.out.println(s1.name);
        s1.setroll(152);
        System.out.println(s1.roll);
        System.out.println("---------");

        bankAccount mine=new bankAccount();
        mine.name="saroj";
        System.out.println(mine.name);
        mine.password="asdfg";
        System.out.println(mine.password);
    }
}
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
class student{
    String name;
    int roll;
     
    void setname(String newname){
        name=newname;
    }
    void setroll(int newroll){
        roll=newroll;
    }
}
//access modifier
//if public we can access anywehere
//if protected we can access anywhere except 'outside package'
//if private we can access only in class
class bankAccount{
    public String name;
    protected String password;

}