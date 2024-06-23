public class superInstanceVariable {
    public static void main(String[] args) {
       car c=new car();
       c.disply(); 
    }
}
class vehicle{
    int speed=120; 
}
class car extends vehicle{
    int speed=180;
    void disply(){
        System.out.println("speed is="+super.speed);
    }
}
