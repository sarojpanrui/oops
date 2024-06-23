public class dynamicMethodDispatch {
    public static void main(String[] args) {
        phone obj=new smartphone();
        obj.on();
        obj.time();
        /*obj.music(); not possible only super class methods 
        & overridden method are called possible*/
        
    }
}
class phone{
    void time(){
        System.out.println("This is 12 o'clock");
    }
    void on(){
        System.out.println("Turning on phone");
    }
}
class smartphone extends phone{
    void on(){
        System.out.println("Turning on smartphone");
    }
    void music(){       
            System.out.println("Turning on music");
    }
}
