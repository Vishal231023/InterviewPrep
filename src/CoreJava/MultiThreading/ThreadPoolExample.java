package CoreJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        System.out.println("Fixed Thread Pool Started");

        for(int i =0;i<5;i++){
            final int taskId= i;
            fixedThreadPool.execute(() ->{
                System.out.println("Fixed Thread Task "+ taskId +
                        "Thread " + Thread.currentThread().getName());
            });
        }

        fixedThreadPool.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("Cached Thread Pool Started");

        for(int i =0;i<5;i++){
            final int taskId= i;
            cachedThreadPool.execute(() ->{
                System.out.println("Cached Thread Task "+ taskId +
                        "Thread " + Thread.currentThread().getName());
            });
        }

        cachedThreadPool.shutdown();

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        System.out.println("\nSingle Thread Executor:");
// Submit tasks to the SingleThreadExecutor
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            singleThreadExecutor.execute(() -> {
                // Task execution
                System.out.println("Single Thread Task " + taskId +
                        " executed by Thread: " +
                        Thread.currentThread().getName());
            });
        }

        singleThreadExecutor.shutdown();
        // Scheduled Thread Pool
// Create a ScheduledThreadPool with 2 threads
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);

// Schedule a task to execute after 5 seconds
        scheduledThreadPool.schedule(() ->
                        System.out.println("Scheduled Task"),
                5, TimeUnit.SECONDS);

// Schedule a task to execute every 1 second, starting immediately
        scheduledThreadPool.scheduleAtFixedRate(() ->
                        System.out.println("Scheduled Task"),
                0, 1, TimeUnit.SECONDS);

        scheduledThreadPool.shutdown();





    }





}
