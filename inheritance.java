public class inheritance {
    public static void main(String[] args) {
       fish shark=new fish();
       shark.eat();

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

//single level inheritance
class fish extends animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}


