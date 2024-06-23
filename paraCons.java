public class paraCons {
    public static void main(String[] args) {
        student s=new student(152, "saroj");
        student x=new student(158, "sayan");
    }
}
class student{
    int roll;
    String name;
    student(int roll,String name){
        this.name=name;
        this.roll=roll;
        System.out.println("Roll is ->"+roll);
        System.out.println("name is->"+name);
    }
}
