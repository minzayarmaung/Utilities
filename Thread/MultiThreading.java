package CodingWithJohn.Thread;

public class MultiThreading implements Runnable  {
    // To get the Thread Number
    private int threadNumber;
    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i + "From thread " + threadNumber);
           
            if(threadNumber == 3)
                throw new RuntimeException();
            // Even though the 3 is facing Exception error,
            // all the other codes run independently

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } // One Second Sleep
        }
    }
}
