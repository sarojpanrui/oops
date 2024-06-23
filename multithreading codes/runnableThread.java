class newThread implements Runnable{
    newThread(){
        Thread t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread:"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread:"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread Interrupt");
        }
        System.out.println("Child Thread Existing...");
    }
}

public class runnableThread {
    public static void main(String[] args) {
        new newThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread:"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupt");
        }
        System.out.println("Main Thread Existing...");
    
    }
}
