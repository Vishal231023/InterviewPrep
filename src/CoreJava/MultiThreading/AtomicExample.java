package CoreJava.MultiThreading;


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            for (int i =0;i<50000;i++){
                sharedCounter.increment();
            }

             System.out.println("Thread 1 is Complete");

        });

         Thread t2 = new Thread(() ->{
             System.out.println("Thread 2 started");
             for (int i =0;i<50000;i++){
                 sharedCounter.increment();
             }

             System.out.println("Thread 2 is Complete");

         });
         t1.start();
         t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final Count: " + sharedCounter.getCount());




    }
}

class SharedCounter{
    //public AtomicInteger count = new AtomicInteger(0); // example of atomicInteger

    public int count =0;

    public   void increment(){
        count++;
    }

//    public void  increment(){
//         count.incrementAndGet();
//    }

//    public int getCount(){
//        return count.get;
//    }

    public int getCount(){
        return count;
    }
}
