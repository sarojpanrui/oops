public class dyn_meth_disp {
   public static void main(String[] args) {
        phone p=new smartPhone();
        //p.music(); not possible
        p.on();
        p.time();
   } 
}
class phone{
    void time(){
        System.out.println("This is 12 o'clock");
    }
    void on(){
        System.out.println("turning on phone");
    }
}
class smartPhone extends phone{
    void music(){
        System.out.println("Play music");
    }
    void on(){
        System.out.println("turning on smart phone");
    }
}
