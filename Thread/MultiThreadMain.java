package CodingWithJohn.Thread;

public class MultiThreadMain{
   public static void main(String[] args) {
    // MultiThreading thing = new MultiThreading();
    // MultiThreading thing1 = new MultiThreading();
    // MultiThreading thing2 = new MultiThreading();
    // thing.run();
    // System.out.println("Thing.run() Method Completed !"); 

    // thing1.start();
    // thing2.start();
    // System.out.println("Thing.start() Method Completed !");

    for(int i=1;i<=3;i++){
        MultiThreading thing = new MultiThreading(i);
        Thread myThread = new Thread(thing); 
        // need to extend cuz of implementing Runnable interface

        myThread.start();
        try {
            myThread.join(); 
        // WAITING THE THREAD TO COMPLETE

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       Boolean ans = myThread.isAlive(); 
       // Whether the thread finish or not by return true or false
       System.out.println(ans);
    }
    throw new RuntimeException();
    // Even the Exception from main method cant stop

   }
    
}