public class multilevel_inheritance {
    public static void main(String[] args) {
       dog d1=new dog();
       
       d1.legs=4;
       System.out.println(d1.legs);

    }
}
class animal{
    String color;

   
    void eat(){
        System.out.println("Eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class memel extends animal{
    int legs;
}
class dog extends memel{
    String breed;
}

