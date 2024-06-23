
public class parametarised {
    public static void main(String[] args) {
        student s=new student("saroj",152);
    }
}
class student{
    String name;
    int roll;
    student(String names,int rolll){
        this.name=names;
        this.roll=rolll;
        System.out.println("The name is:"+name);
        System.out.println("Roll is:"+roll);
    }
}
