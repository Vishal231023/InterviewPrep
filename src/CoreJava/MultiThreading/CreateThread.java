package CoreJava.MultiThreading;

public class CreateThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.Run();

        MyRunnableThread runnableThread = new MyRunnableThread();
        Thread thread1 = new Thread(runnableThread);
        thread1.start();

        //Java 8 using lamba implementation

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
        });
        thread2.start();

        Runnable runnableObject = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ObjectRunnable Thread is running");

        };

        Thread objectRunnable = new Thread(runnableObject);
        objectRunnable.start();


    }
}

class MyThread extends Thread {
    void Run() {
        // Code to be executed by the thread
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

}

class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
